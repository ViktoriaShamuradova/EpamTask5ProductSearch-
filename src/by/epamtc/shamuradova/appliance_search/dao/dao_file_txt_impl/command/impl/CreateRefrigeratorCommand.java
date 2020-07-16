package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;


import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Refrigerator;

import java.util.Map;

public class CreateRefrigeratorCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Refrigerator refrigerator = new Refrigerator.Builder().setFreezerCapacity(Double.parseDouble(properties.get("FREEZER_CAPACITY")))
                .setHeight(Double.parseDouble(properties.get("HEIGHT")))
                .setOverallCapacity(Double.parseDouble(properties.get("OVERALL_CAPACITY")))
                .setPowerConsumption(Double.parseDouble(properties.get("POWER_CONSUMPTION")))
                .setWeight(Double.parseDouble(properties.get("WEIGHT")))
                .setWidth(Double.parseDouble(properties.get("WIDTH")))
                .build();
        return refrigerator;
    }
}
