package by.epamtc.shamuradova.appliance_search.service.impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_factory.DaoFactory;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.service.ApplianceService;
import by.epamtc.shamuradova.appliance_search.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    public ApplianceServiceImpl() {

    }

    @Override
    public List<Appliance> allAppliance() {
        return null;
    }

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criterialValidator(criteria)) {
            return null;
        }
        DaoFactory daoFactory = DaoFactory.getInstance();
        ApplianceDAO applianceDao = daoFactory.getApplianceDao();

        Appliance appliance = applianceDao.find(criteria);
        /////
        return null;


    }
}
