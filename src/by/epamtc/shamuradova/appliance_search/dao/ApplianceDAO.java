package by.epamtc.shamuradova.appliance_search.dao;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> allAppliance();

    Appliance find(Criteria criteria);
}
