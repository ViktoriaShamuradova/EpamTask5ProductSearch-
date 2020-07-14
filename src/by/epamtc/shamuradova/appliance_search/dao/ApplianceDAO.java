package by.epamtc.shamuradova.appliance_search.dao;

import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> allAppliance() throws DAOException;

    List<Appliance> find(Criteria criteria) throws DAOException;
}
