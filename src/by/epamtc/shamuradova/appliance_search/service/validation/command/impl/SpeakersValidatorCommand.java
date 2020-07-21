package by.epamtc.shamuradova.appliance_search.service.validation.command.impl;


import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;

import java.util.Map;

public class SpeakersValidatorCommand implements Command {
    private static double minPowerConsumption = 10;
    private static double maxPowerConsumption = 25;

    private static int minNumberOfSpeakers = 2;
    private static int maxNumberOfSpeakers = 5;

    private static String frequencyRange1 = "2-4";
    private static String frequencyRange2 = "3-4";
    private static String frequencyRange3 = "2-3.5";

    private static double minCordLength = 1;
    private static double maxCordLength = 6;

    @Override
    public boolean execute(Criteria criteria) {

        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minPowerConsumption || value > maxPowerConsumption) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
                try {
                    Integer value = (Integer) item.getValue();
                    if (value < minNumberOfSpeakers || value > maxNumberOfSpeakers) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
                try {
                    String frequencyRange = (String) item.getValue();
                    if (!frequencyRange.equalsIgnoreCase(frequencyRange1) && !frequencyRange.equalsIgnoreCase(frequencyRange2)
                            && !frequencyRange.equalsIgnoreCase(frequencyRange3)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
                try {
                    Double value = (Double) item.getValue();
                    if (value < minCordLength || value > maxCordLength) {
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
