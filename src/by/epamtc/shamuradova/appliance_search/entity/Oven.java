package by.epamtc.shamuradova.appliance_search.entity;

import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven implements Appliance {

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;
    private Map<String, Object> characteristics = new HashMap<>();


    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        characteristics.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), powerConsumption);
        characteristics.put(SearchCriteria.Oven.WEIGHT.toString(), weight);
        characteristics.put(SearchCriteria.Oven.CAPACITY.toString(), capacity);
        characteristics.put(SearchCriteria.Oven.DEPTH.toString(), depth);
        characteristics.put(SearchCriteria.Oven.DEPTH.toString(), depth);
        characteristics.put(SearchCriteria.Oven.WIDTH.toString(), width);
    }

    public Oven() {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 &&
                Double.compare(oven.weight, weight) == 0 &&
                Double.compare(oven.capacity, capacity) == 0 &&
                Double.compare(oven.depth, depth) == 0 &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
    public static class Builder {
        Oven oven = new Oven();

        public Builder setPowerConsumption(double powerConsumption) {
            oven.setPowerConsumption(powerConsumption);
            return this;
        }

        public Builder setWeight(double weight) {
            oven.setWeight(weight);
            return this;
        }

        public Builder setCapacity(double capacity) {
            oven.setCapacity(capacity);
            return this;
        }

        public Builder setDepth(double depth) {
            oven.setDepth(depth);
            return this;
        }

        public Builder setHeight(double height) {
            oven.setHeight(height);
            return this;
        }

        public Builder setWidth(double width) {
            oven.setWidth(width);
            return this;
        }
        public Oven build(){
            return oven;
        }
    }
}
