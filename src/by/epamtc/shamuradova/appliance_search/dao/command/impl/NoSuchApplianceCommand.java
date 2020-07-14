package by.epamtc.shamuradova.appliance_search.dao.command.impl;

import by.epamtc.shamuradova.appliance_search.dao.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;

public class NoSuchApplianceCommand implements Command {
    @Override
    public List<Appliance> execute(Criteria criteria, List<Appliance> appliances) {
        return null;
    }
}
