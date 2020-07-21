package by.epamtc.shamuradova.appliance_search.service.validation.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;

import java.util.Map;

public class VacuumCleanerValidatorCommand implements Command {

    private static double minPowerConsumption = 90;
    private static double maxPowerConsumption = 120;

    private static char filterTypeA = 'A';
    private static char filterTypeB = 'B';
    private static char filterTypeC = 'C';

    private static double minCleaningWidth = 15;
    private static double maxCleaningWidth = 35;

    private static double minMotorSpeedRegulation = 2500;
    private static double maxMotorSpeedRegulation = 3500;

    private static String wandType = "all-in-one";

    private static String bagTypeA = "A2";
    private static String bagTypeAA = "AA-89";
    private static String bagTypeXX = "XX00";

    @Override
    public boolean execute(Criteria criteria) {
        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minPowerConsumption || value > maxPowerConsumption) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
                try {
                    Character value = (Character) item.getValue();
                    if (value != filterTypeA && value != filterTypeB && value != filterTypeC) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
                try {
                    String bagType = (String) item.getValue();
                    if (!bagType.equalsIgnoreCase(bagTypeA) && !bagType.equalsIgnoreCase(bagTypeAA)
                            && !bagType.equalsIgnoreCase(bagTypeXX)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
                try {
                    String wandTypeCr = (String) item.getValue();
                    if (!wandTypeCr.equalsIgnoreCase(wandType)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minMotorSpeedRegulation || value > maxMotorSpeedRegulation) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minCleaningWidth || value > maxCleaningWidth) {
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
