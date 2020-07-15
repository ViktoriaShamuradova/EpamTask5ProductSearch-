package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Oven;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintOvenCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Oven oven = (Oven) appliance;

        System.out.println("Oven");
        System.out.println("POWER_CONSUMPTION: " + oven.getPowerConsumption() + "\n" +
                        "WEIGHT: " + oven.getWeight() + "\n" +
                        "CAPACITY: " + oven.getCapacity() + "\n" +
                        "DEPTH: " + oven.getDepth() + "\n" +
                        "HEIGHT: " + oven.getHeight() + "\n" +
                        "WIDTH: " + oven.getWidth() + ";"
        );
    }
}
