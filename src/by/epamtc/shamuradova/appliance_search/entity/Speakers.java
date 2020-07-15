package by.epamtc.shamuradova.appliance_search.entity;

import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers implements Appliance {
    private  double powerConsumption;
    private  int numberOfSpeakers;
    private  String frequencyRange;
    private  double cordLength;
    private Map<String, Object> characteristics = new HashMap<>();



    public Speakers(double powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
        characteristics.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), powerConsumption);
        characteristics.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), numberOfSpeakers);
        characteristics.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), frequencyRange);
        characteristics.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), cordLength);
    }
    public Speakers(){

    }


    public Map<String, Object> getCharacteristics() {
        return new HashMap<>(characteristics);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.cordLength, cordLength) == 0 &&
                Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
