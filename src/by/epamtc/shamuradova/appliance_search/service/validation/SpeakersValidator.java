package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.Map;

public class SpeakersValidator {
    private static double minPowerConsumption = 10;
    private static double maxPowerConsumption = 25;

    private static int minNumberOfSpeakers = 2;
    private static int maxNumberOfSpeakers = 5;

    private static String frequencyRange1 = "2-4";
    private static String frequencyRange2 = "3-4";
    private static String frequencyRange3 = "2-3.5";

    private static double minCordLength = 1;
    private static double maxCordLength = 6;


    public static boolean check(Criteria criteria) {

        Map<String, Object> criteria1 = criteria.getCriteria();

        for (Map.Entry<String, Object> item : criteria1.entrySet()) {
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                Double value = (Double) item.getValue();
                if (value < minPowerConsumption || value > maxPowerConsumption) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
                Integer value = (Integer) item.getValue();
                if (value < minNumberOfSpeakers || value > maxNumberOfSpeakers) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
                String frequencyRange = (String)item.getValue();
                if (!frequencyRange.equalsIgnoreCase(frequencyRange1) && !frequencyRange.equalsIgnoreCase(frequencyRange2)
                        && !frequencyRange.equalsIgnoreCase(frequencyRange3)) {
                    return false;
                }
            }
            if (item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
                Double value = (Double) item.getValue();
                if (value < minCordLength || value > maxCordLength) {
                    return false;
                }
            }


        }
        return true;
    }
}
