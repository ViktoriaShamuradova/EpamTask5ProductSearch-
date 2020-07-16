package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorValidator {


    private static double minPowerConsumption = 100;
    private static double maxPowerConsumption = 250;

    private static double minFreezerCapacity = 10;
    private static double maxFreezerCapacity = 25;

    private static double minOverallCapacity = 300;
    private static double maxOverallCapacity = 400;

    private static double minHeight = 180;
    private static double maxHeight = 300;

    private static double minWeight = 20;
    private static double maxWeight = 40;

    private static double minWidth = 70;
    private static double maxWidth = 85;


    public static boolean check(Criteria criteria) {

        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minPowerConsumption || value > maxPowerConsumption) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.WEIGHT.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minWeight || value > maxWeight) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minOverallCapacity || value > maxOverallCapacity) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.HEIGHT.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minHeight || value > maxHeight) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }

            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.WIDTH.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minWidth || value > maxWidth) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minFreezerCapacity || value > maxFreezerCapacity) {
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
