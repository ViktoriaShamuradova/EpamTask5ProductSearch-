package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.TabletPC;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintTablePCCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        System.out.println("TabletPC");
        System.out.println("BATTERY_CAPACITY: " + tabletPC.getBatteryCapacity() + "\n" +
                        "FLASH_MEMORY_CAPACITY: " + tabletPC.getBatteryCapacity() + "\n" +
                        "MEMORY_ROM: " + tabletPC.getMemoryRom() + "\n" +
                        "COLOR: " + tabletPC.getColor() + "\n" +
                        "DISPLAY_INCHES: " + tabletPC.getDisplayInchs() + ";"
        );

    }
}
