package by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.command.provider.CommandProvider;
import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.dao.exception.ReaderException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;


import java.io.File;
import java.util.List;

public class ApplianceFileBinDAOImpl implements ApplianceDAO {

    private File applianceFile = new File("resources/Appliances.bin");
    private WriterApplianceInFile writer = new WriterApplianceInFile();
    private ReaderApplianceFromFile reader = new ReaderApplianceFromFile();

    public ApplianceFileBinDAOImpl() {
    }


    @Override
    public List<Appliance> allAppliance() throws DAOException {
        try {
            return reader.readAppliance(applianceFile);
        } catch (ReaderException e) {
            throw new DAOException();
        }
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        CommandProvider provider = new CommandProvider();
        Command currentCommand;

        currentCommand = provider.takeCommand(criteria.getSearchName());
        return currentCommand.execute(criteria, allAppliance());
    }

}
