package by.epamtc.shamuradova.appliance_search.service.validation.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;

import java.util.Map;

public class OvenValidatorCommand implements Command {

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

    @Override
    public boolean execute(Criteria criteria) {
        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minPowerConsumption || value > maxPowerConsumption) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.CAPACITY.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minCapacity || value > maxCapacity) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.DEPTH.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minDepth || value > maxDepth) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.HEIGHT.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minHeight || value > maxHeight) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WEIGHT.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minWeight || value > maxWeight) {
                        return false;
                    }
                }catch (ClassCastException e){
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WIDTH.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minWidth || value > maxWidth) {
                        return false;
                    }
                }catch (ClassCastException e){
                    return false;
                }
            }
        }
        return true;
    }
}
