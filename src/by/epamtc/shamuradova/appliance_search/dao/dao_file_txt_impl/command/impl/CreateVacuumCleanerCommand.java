package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;


import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.VacuumCleaner;

import java.util.Map;

public class CreateVacuumCleanerCommand implements Command {

    @Override
    public Appliance execute(Map<String, String> properties) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner.Builder().setBagType(properties.get("BAG_TYPE"))
                .setCleaningWidth(Double.parseDouble(properties.get("CLEANING_WIDTH")))
                .setFilterType((properties.get("FILTER_TYPE")).charAt(0))
                .setMotorSpeedRegulation(Double.parseDouble(properties.get("MOTOR_SPEED_REGULATION")))
                .setWandType(properties.get("WAND_TYPE"))
                .setPowerConsumption(Double.parseDouble(properties.get("POWER_CONSUMPTION")))
                .build();
        return vacuumCleaner;
    }
}
