package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;

import java.util.Map;

public interface Command {
    Appliance execute(Map<String, String> properties);
}
