package by.epamtc.shamuradova.appliance_search.dao.dao_factory;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.impl.ApplianceFileBinDAOImpl;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.ApplianceFileTxtDAOImpl;

public final class DaoFactory {

    private static final DaoFactory INSTANCE = new DaoFactory();

    //private final ApplianceDAO APPLIANCE_FILE_BIN_DAO = new ApplianceFileBinDAOImpl();
    private final ApplianceDAO APPLIANCE_FILE_TXT_DAO = new ApplianceFileTxtDAOImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return INSTANCE;
    }

    public ApplianceDAO getApplianceDao() {

        return APPLIANCE_FILE_TXT_DAO;
    }
}
