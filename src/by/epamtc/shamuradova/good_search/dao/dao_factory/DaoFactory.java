package by.epamtc.shamuradova.good_search.dao.dao_factory;

import by.epamtc.shamuradova.good_search.dao.GoodDao;
import by.epamtc.shamuradova.good_search.dao.impl.FileGoodDaoImpl;

public final class DaoFactory {
    private static final DaoFactory INSTANCE = new DaoFactory();

    private final GoodDao fileDaoImpl = new FileGoodDaoImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return INSTANCE;
    }

    public GoodDao getGoodDao() {
        return fileDaoImpl;
    }
}