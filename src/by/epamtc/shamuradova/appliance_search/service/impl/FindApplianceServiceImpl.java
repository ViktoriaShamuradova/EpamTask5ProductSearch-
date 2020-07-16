package by.epamtc.shamuradova.appliance_search.service.impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_factory.DaoFactory;
import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.service.FindApplianceService;
import by.epamtc.shamuradova.appliance_search.service.exception.ServiceException;
import by.epamtc.shamuradova.appliance_search.service.validation.CriteriaValidator;

import java.util.List;

public class FindApplianceServiceImpl implements FindApplianceService {

    public FindApplianceServiceImpl() {

    }

    @Override
    public List<Appliance> allAppliance() throws ServiceException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        ApplianceDAO applianceDao = daoFactory.getApplianceDao();

        try {
            return applianceDao.allAppliance();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (CriteriaValidator.checkCriteria(criteria)) {
            DaoFactory daoFactory = DaoFactory.getInstance();
            ApplianceDAO applianceDao = daoFactory.getApplianceDao();

            List<Appliance> appliance;
            try {
                appliance = applianceDao.find(criteria);
            } catch (DAOException e) {
                throw new ServiceException(e);
            }
            return appliance;
        } else {
            throw new ServiceException("not valid criteria, check name of appliance and type of properties value");
        }
    }
}
