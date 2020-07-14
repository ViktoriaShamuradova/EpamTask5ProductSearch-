package by.epamtc.shamuradova.appliance_search.dao.command;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;

public interface Command {

    public List<Appliance> execute(Criteria criteria, List<Appliance> appliances);
}
