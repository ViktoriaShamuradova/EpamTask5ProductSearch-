package by.epamtc.shamuradova.appliance_search.main.command.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Speakers;
import by.epamtc.shamuradova.appliance_search.main.command.Command;

public class PrintSpeakersCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;

        System.out.println("Speakers");
        System.out.println("POWER_CONSUMPTION: " + speakers.getPowerConsumption() + "\n" +
                        "NUMBER_OF_SPEAKERS: " + speakers.getNumberOfSpeakers() + "\n" +
                        "FREQUENCY_RANGE: " + speakers.getFrequencyRange() + "\n" +
                        "CORD_LENGTH: " + speakers.getCordLength() + ";"
        );
    }
}
