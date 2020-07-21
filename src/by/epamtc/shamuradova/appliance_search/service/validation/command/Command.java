package by.epamtc.shamuradova.appliance_search.service.validation.command;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

public interface Command {

    boolean execute(Criteria criteria);
}
