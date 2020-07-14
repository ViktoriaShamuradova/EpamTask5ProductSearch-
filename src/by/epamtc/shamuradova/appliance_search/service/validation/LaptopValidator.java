package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.Map;

public class LaptopValidator {

    private static double minBatteryCapacity = 1;
    private static double maxBatteryCapacity = 4;

    private static double minCPU = 1;
    private static double maxCPU = 4;

    private static double minDisplayInchs = 13;
    private static double maxDisplayInchs = 25;

    private static double minDisplaySystemMemory = 1000;
    private static double maxDisplaySystemMemory = 1600;

    private static double minDisplayMemoryRom = 3000;
    private static double maxDisplayMemoryRom = 25;


    private static String osWindow = "Windows";
    private static String osLinux = "Linux";


    public static boolean check(Criteria criteria) {

        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
                Double value = (Double) item.getValue();
                if (value < minBatteryCapacity || value > maxBatteryCapacity) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.CPU.toString())) {
                Double value = (Double) item.getValue();
                if (value < minCPU || value > maxCPU) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
                Double value = (Double) item.getValue();
                if (value < minDisplayInchs || value > maxDisplayInchs) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
                Double value = (Double) item.getValue();
                if (value < minDisplaySystemMemory || value > maxDisplaySystemMemory) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
                Double value = (Double) item.getValue();
                if (value < minDisplayMemoryRom || value > maxDisplayMemoryRom) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.OS.toString())) {
                String os = (String)item.getValue();
                if (!os.equalsIgnoreCase(osWindow) && !os.equalsIgnoreCase((osLinux))) {
                    return false;
                }
            }

        }
        return true;
    }
}
