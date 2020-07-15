package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.VacuumCleaner;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintVacuumCleanerCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

        System.out.println("VacuumCleaner");
        System.out.println("POWER_CONSUMPTION: " + vacuumCleaner.getPowerConsumption() + "\n" +
                        "FILTER_TYPE: " + vacuumCleaner.getFilterType() + "\n" +
                        "BAG_TYPE: " + vacuumCleaner.getBagType() + "\n" +
                        "WAND_TYPE: " + vacuumCleaner.getWandType() + "\n" +
                        "MOTOR_SPEED_REGULATION: " + vacuumCleaner.getMotorSpeedRegulation() + "\n" +
                        "CLEANING_WIDTH: " + vacuumCleaner.getCleaningWidth() + ";"
        );
    }
}
