package by.epamtc.shamuradova.appliance_search.service.validation.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;

import java.util.Map;

public class TabletPCValidator implements Command {

    private static double minBatteryCapacity = 2;
    private static double maxBatteryCapacity = 6;

    private static double minDisplayInchs = 13;
    private static double maxDisplayInchs = 17;

    private static double minMemoryRom = 8000;
    private static double maxMemoryRom = 16000;

    private static double minFlashMemoryCapacity = 1;
    private static double maxFlashMemoryCapacity = 10;


    private static String colorBlue = "Blue";
    private static String colorRed = "Red";
    private static String colorGreen = "Green";

    @Override
    public boolean execute(Criteria criteria) {
        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minBatteryCapacity || value > maxBatteryCapacity) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minDisplayInchs || value > maxDisplayInchs) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minMemoryRom || value > maxMemoryRom) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minFlashMemoryCapacity || value > maxFlashMemoryCapacity) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }

            if (item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.COLOR.toString())) {
                try {
                    String color = (String) item.getValue();
                    if (!color.equalsIgnoreCase(colorBlue) && !color.equalsIgnoreCase(colorGreen)
                            && !color.equalsIgnoreCase(colorRed)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
        }
        return true;
    }
}
