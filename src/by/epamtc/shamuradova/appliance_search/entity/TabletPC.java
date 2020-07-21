package by.epamtc.shamuradova.appliance_search.entity;

import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC implements Appliance {
    private double batteryCapacity;
    private double displayInchs;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;
    private Map<String, Object> characteristics = new HashMap<>();


    public TabletPC(double batteryCapacity, double displayInchs, double memoryRom, double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInchs = displayInchs;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
        characteristics.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), batteryCapacity);
        characteristics.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), flashMemoryCapacity);
        characteristics.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), memoryRom);
        characteristics.put(SearchCriteria.TabletPC.COLOR.toString(), color);
        characteristics.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), displayInchs);
    }

    public TabletPC() {
    }


    public Map<String, Object> getCharacteristics() {
        return new HashMap<>(characteristics);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryRom() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tablePC = (TabletPC) o;
        return Double.compare(tablePC.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(tablePC.displayInchs, displayInchs) == 0 &&
                Double.compare(tablePC.memoryRom, memoryRom) == 0 &&
                Double.compare(tablePC.flashMemoryCapacity, flashMemoryCapacity) == 0 &&
                Objects.equals(color, tablePC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInchs, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TablePC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInchs=" + displayInchs +
                ", memoryRom=" + memoryRom +
                ", flashMemoryRom=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        TabletPC tabletPC = new TabletPC();

        public Builder setBatteryCapacity(double batteryCapacity) {
            tabletPC.setBatteryCapacity(batteryCapacity);
            return this;
        }

        public Builder setFlashMemoryCapacity(Double flashMemoryCapacity) {
            tabletPC.setFlashMemoryCapacity(flashMemoryCapacity);
            return this;
        }

        public Builder setMemoryRom(double memoryRom) {
            tabletPC.setMemoryRom(memoryRom);
            return this;
        }

        public Builder setColor(String color) {
            tabletPC.setColor(color);
            return this;
        }

        public Builder setDisplayInchs(double displayInchs) {
            tabletPC.setDisplayInchs(displayInchs);
            return this;
        }

        public TabletPC build() {

            return tabletPC;
        }
    }
}
