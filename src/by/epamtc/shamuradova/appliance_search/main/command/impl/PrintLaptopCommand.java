package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Laptop;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintLaptopCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        System.out.println("Laptop");
        System.out.println("BATTERY_CAPACITY: " + laptop.getBatteryCapacity() + "\n" +
                "OS: " + laptop.getOs() + "\n" +
                "MEMORY_ROM: " + laptop.getMemoryRom() + "\n" +
                "SYSTEM_MEMORY: " + laptop.getSystemMemory() + "\n" +
                "CPU: " + laptop.getCpu() + "\n" +
                "DISPLAY_INCHES: " + laptop.getDisplayInchs() + ";"
        );

    }
}
