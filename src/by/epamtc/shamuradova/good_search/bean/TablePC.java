package by.epamtc.shamuradova.good_search.bean;

import java.util.Objects;

public class TablePC extends Good  {
    private  double batteryCapacity;
    private  double displayInchs;
    private  double memoryRom;
    private  double flashMemoryRom;
    private  String color; //ENUM

    public TablePC(double batteryCapacity, double displayInchs, double memoryRom, double flashMemoryRom, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInchs = displayInchs;
        this.memoryRom = memoryRom;
        this.flashMemoryRom = flashMemoryRom;
        this.color = color;
    }
    public TablePC(){}

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
        return flashMemoryRom;
    }

    public void setFlashMemoryRom(double flashMemoryRom) {
        this.flashMemoryRom = flashMemoryRom;
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
        TablePC tablePC = (TablePC) o;
        return Double.compare(tablePC.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(tablePC.displayInchs, displayInchs) == 0 &&
                Double.compare(tablePC.memoryRom, memoryRom) == 0 &&
                Double.compare(tablePC.flashMemoryRom, flashMemoryRom) == 0 &&
                Objects.equals(color, tablePC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInchs, memoryRom, flashMemoryRom, color);
    }

    @Override
    public String toString() {
        return "TablePC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInchs=" + displayInchs +
                ", memoryRom=" + memoryRom +
                ", flashMemoryRom=" + flashMemoryRom +
                ", color='" + color + '\'' +
                '}';
    }
}
