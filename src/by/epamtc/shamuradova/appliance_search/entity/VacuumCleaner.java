package by.epamtc.shamuradova.appliance_search.entity;


import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner implements Appliance {
    private double powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;
    private Map<String, Object> characteristics = new HashMap<>();

    public VacuumCleaner(double powerConsumption, char filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        characteristics.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), powerConsumption);
        characteristics.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), filterType);
        characteristics.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), bagType);
        characteristics.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), wandType);
        characteristics.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), motorSpeedRegulation);
        characteristics.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), cleaningWidth);
    }

    public VacuumCleaner() {
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

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                filterType == that.filterType &&
                Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 &&
                Double.compare(that.cleaningWidth, cleaningWidth) == 0 &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    public static class Builder {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        public Builder setBagType(String bagType) {
            vacuumCleaner.setBagType(bagType);
            return this;
        }

        public Builder setCleaningWidth(Double cleaningWidth) {
            vacuumCleaner.setCleaningWidth(cleaningWidth);
            return this;
        }

        public Builder setMotorSpeedRegulation(double motorSpeedRegulation) {
            vacuumCleaner.setMotorSpeedRegulation(motorSpeedRegulation);
            return this;
        }

        public Builder setFilterType(char filterType) {
            vacuumCleaner.setFilterType(filterType);
            return this;
        }

        public Builder setWandType(String wandType) {
            vacuumCleaner.setWandType(wandType);
            return this;
        }

        public Builder setPowerConsumption(double powerConsumption) {
            vacuumCleaner.setPowerConsumption(powerConsumption);
            return this;
        }

        public VacuumCleaner build() {

            return vacuumCleaner;
        }
    }
}
