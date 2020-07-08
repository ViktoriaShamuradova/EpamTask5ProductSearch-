package by.epamtc.shamuradova.good_search.bean;

import java.util.Objects;

public class Laptop extends Good {
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop(double batteryCapacity, String os, double memoryRom, double systemMemory, double cpu, double displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public Laptop() {
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(laptop.memoryRom, memoryRom) == 0 &&
                Double.compare(laptop.systemMemory, systemMemory) == 0 &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                Double.compare(laptop.displayInchs, displayInchs) == 0 &&
                Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }
}
