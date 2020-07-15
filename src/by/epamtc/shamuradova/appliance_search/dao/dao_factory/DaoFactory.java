package by.epamtc.shamuradova.appliance_search.dao.dao_factory;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.impl.ApplianceFileBinDAOImpl;

public final class DaoFactory {

    private static final DaoFactory INSTANCE = new DaoFactory();

    private final ApplianceDAO APPLIANCE_FILE_DAO = new ApplianceFileBinDAOImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return INSTANCE;
    }

    public ApplianceDAO getApplianceDao() {
        return APPLIANCE_FILE_DAO;
    }
}
