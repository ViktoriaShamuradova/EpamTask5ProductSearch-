package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;


import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Oven;

import java.util.Map;

public class CreateOvenCommand implements Command {

    @Override
    public Appliance execute(Map<String, String> properties) {
        Oven oven = new Oven.Builder().setCapacity(Double.parseDouble(properties.get("CAPACITY")))
                .setDepth(Double.parseDouble(properties.get("DEPTH")))
                .setHeight(Double.parseDouble(properties.get("HEIGHT")))
                .setPowerConsumption(Double.parseDouble(properties.get("POWER_CONSUMPTION")))
                .setWeight(Double.parseDouble(properties.get("WEIGHT")))
                .setWidth(Double.parseDouble(properties.get("WIDTH")))
                .build();
        return oven;
    }
}
