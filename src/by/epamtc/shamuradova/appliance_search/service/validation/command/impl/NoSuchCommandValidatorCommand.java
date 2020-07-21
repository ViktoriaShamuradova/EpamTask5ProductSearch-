package by.epamtc.shamuradova.appliance_search.service.validation.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;

public class NoSuchCommandValidatorCommand implements Command {

    @Override
    public boolean execute(Criteria criteria) {
        return false;
    }
}
