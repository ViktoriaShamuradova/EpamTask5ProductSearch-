package by.epamtc.shamuradova.appliance_search.main.command;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;

public interface Command {
    void execute(Appliance appliance);
}
