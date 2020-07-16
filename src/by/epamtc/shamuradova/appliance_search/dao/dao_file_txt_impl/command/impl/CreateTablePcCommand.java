package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;

import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.TablePC;

import java.util.Map;

public class CreateTablePcCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> properties) {
        TablePC tablePC = new TablePC.Builder().setBatteryCapacity(Double.parseDouble(properties.get("BATTERY_CAPACITY")))
                .setColor(properties.get("COLOR"))
                .setDisplayInchs(Double.parseDouble(properties.get("DISPLAY_INCHES")))
                .setFlashMemoryCapacity(Double.parseDouble(properties.get("FLASH_MEMORY_CAPACITY")))
                .setMemoryRom(Double.parseDouble(properties.get("MEMORY_ROM")))
                .build();
        return tablePC;
    }
}
