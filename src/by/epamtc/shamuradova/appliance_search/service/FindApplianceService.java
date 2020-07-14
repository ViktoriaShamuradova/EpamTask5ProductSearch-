package by.epamtc.shamuradova.appliance_search.service;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.service.exception.ServiceException;

import java.util.List;

public interface FindApplianceService {

    List<Appliance> allAppliance() throws ServiceException;

    List<Appliance> find(Criteria criteria) throws ServiceException;
}
