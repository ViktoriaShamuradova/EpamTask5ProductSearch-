package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;

import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Laptop;

import java.util.Map;

public class CreateLaptopCommand implements Command {

    @Override
    public Appliance execute(Map<String, String> properties) {
        Laptop laptop = new Laptop.Builder().setBatteryCapacity(Double.parseDouble(properties.get("BATTERY_CAPACITY")))
                .setCpu(Double.parseDouble(properties.get("CPU")))
                .setDisplayInchs(Double.parseDouble(properties.get("DISPLAY_INCHS")))
                .setOs(properties.get("OS"))
                .setMemoryRom(Double.parseDouble(properties.get("MEMORY_ROM")))
                .setSystemMemory(Double.parseDouble(properties.get("SYSTEM_MEMORY")))
                .build();
        return laptop;
    }
}
