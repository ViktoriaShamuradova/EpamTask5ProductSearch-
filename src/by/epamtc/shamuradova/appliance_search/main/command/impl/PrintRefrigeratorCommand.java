package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Refrigerator;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintRefrigeratorCommand implements Command {

    @Override
    public void execute(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        System.out.println("Refrigerator");
        System.out.println("POWER_CONSUMPTION: " + refrigerator.getPowerConsumption() + "\n" +
                        "WEIGHT: " + refrigerator.getWeight() + "\n" +
                        "FREEZER_CAPACITY: " + refrigerator.getFreezerCapacity() + "\n" +
                        "OVERALL_CAPACITY: " + refrigerator.getOverallCapacity() + "\n" +
                        "HEIGHT: " + refrigerator.getHeight() + "\n" +
                        "WIDTH: " + refrigerator.getWidth() + ";"
        );
    }
}
