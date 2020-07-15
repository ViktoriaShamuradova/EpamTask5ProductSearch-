package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.TablePC;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintTablePCCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        TablePC tabletPC = (TablePC) appliance;

        System.out.println("TablePC");
        System.out.println("BATTERY_CAPACITY: " + tabletPC.getBatteryCapacity() + "\n" +
                        "FLASH_MEMORY_CAPACITY: " + tabletPC.getBatteryCapacity() + "\n" +
                        "MEMORY_ROM: " + tabletPC.getMemoryRom() + "\n" +
                        "COLOR: " + tabletPC.getColor() + "\n" +
                        "DISPLAY_INCHES: " + tabletPC.getDisplayInchs() + ";"
        );

    }
}
