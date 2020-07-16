package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl;


import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Speakers;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.List;
import java.util.Map;

public class CreateSpeakersCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Speakers speakers = new Speakers.Builder().setNumberOfSpeakers(Integer.parseInt(properties.get("NUMBER_OF_SPEAKERS")))
                .setCordLength(Double.parseDouble(properties.get("CORD_LENGTH")))
                .setFrequencyRange(properties.get("FREQUENCY_RANGE"))
                .setPowerConsumption(Double.parseDouble(properties.get("POWER_CONSUMPTION")))
                .build();
        return speakers;
    }
}
