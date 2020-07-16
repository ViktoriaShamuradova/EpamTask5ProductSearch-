package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;

import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;

import java.util.Map;

public class CreateNoSuchCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> properties) {
        return null;
    }
}
