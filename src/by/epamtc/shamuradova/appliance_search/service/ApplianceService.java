package by.epamtc.shamuradova.appliance_search.service;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> allAppliance();

    List<Appliance> find(Criteria criteria);
}
