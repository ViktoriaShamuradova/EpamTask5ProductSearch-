package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.Map;

public class OvenValidator {

    private static double minPowerConsumption = 1000;
    private static double maxPowerConsumption = 2100;

    private static double minCapacity = 30;
    private static double maxCapacity = 35;

    private static double minDepth = 50;
    private static double maxDepth = 65;

    private static double minHeight = 30;
    private static double maxHeight = 50;

    private static double minWeight = 9;
    private static double maxWeight = 15;

    private static double minWidth = 50;
    private static double maxWidth = 75;


    public static boolean check(Criteria criteria) {

        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                Double value = (Double) item.getValue();
                if (value < minPowerConsumption || value > maxPowerConsumption) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.CAPACITY.toString())) {
                Double value = (Double) item.getValue();
                if (value < minCapacity || value > maxCapacity) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.DEPTH.toString())) {
                Double value = (Double) item.getValue();
                if (value < minDepth || value > maxDepth) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.HEIGHT.toString())) {
                Double value = (Double) item.getValue();
                if (value < minHeight || value > maxHeight) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WEIGHT.toString())) {
                Double value = (Double) item.getValue();
                if (value < minWeight || value > maxWeight) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WIDTH.toString())) {
                Double value = (Double) item.getValue();
                if (value < minWidth || value > maxWidth) {
                    return false;
                }
            }
        }
        return true;
    }
}
