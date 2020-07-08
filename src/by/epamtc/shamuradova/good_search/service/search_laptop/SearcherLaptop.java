package by.epamtc.shamuradova.good_search.service.search_laptop;

import by.epamtc.shamuradova.good_search.bean.Laptop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SearcherLaptop {
    public List<Laptop> searchLaptop(List<Laptop> laptops, Laptop laptop) {
        List<Laptop> result = new ArrayList<>();
        if (laptop.getBatteryCapacity() != 0 && laptop.getOs() != null
                && laptop.getMemoryRom() != 0 && laptop.getSystemMemory() != 0 &&
                laptop.getCpu() != 0 && laptop.getDisplayInchs() != 0) {
            return searchByAllCharacteristics(laptops, laptop);
        }
        if (laptop.getBatteryCapacity() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByBatteryCapacity(laptops, laptop);
        }
        if (laptop.getOs() != null) { //ожидаеся, что остальные показатели не введены
            return searchByOs(laptops, laptop);
        }
        if (laptop.getMemoryRom() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByMemoryRom(laptops, laptop);
        }
        if (laptop.getSystemMemory() != 0) { //ожидаеся, что остальные показатели не введены
            return searchBySystemMemory(laptops, laptop);
        }
        if (laptop.getCpu() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByCpu(laptops, laptop);
        }
        if (laptop.getDisplayInchs() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByDisplayInchs(laptops, laptop);
        }
        return result;
    }

    private List<Laptop> searchByAllCharacteristics(List<Laptop> laptops, Laptop laptop) {
        List<Laptop> result = new ArrayList<>();

        for (Laptop laptop1 : laptops) {
            if (laptop1.equals(laptop)) {
                result.add(laptop1);
            }
        }
        return result;
    }

    private List<Laptop> searchByDisplayInchs(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new DisplayInchsComparator());
    }

    private List<Laptop> searchByCpu(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new CpuComparator());
    }

    private List<Laptop> searchBySystemMemory(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new SystemMemoryComparator());
    }

    private List<Laptop> searchByMemoryRom(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new MemoryRomComparator());
    }

    private List<Laptop> searchByOs(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new OsComparator());
    }


    private List<Laptop> searchByBatteryCapacity(List<Laptop> laptops, Laptop laptop) {
        return search(laptops, laptop, new BatteryCapacityComparator());
    }

    private List<Laptop> search(List<Laptop> laptops, Laptop laptop, Comparator comparator) {
        List<Laptop> result = new ArrayList<>();

        for (Laptop laptop1 : laptops) {
            if (comparator.compare(laptop1, laptop) == 0) {
                result.add(laptop1);
            }
        }
        return result;
    }

}
