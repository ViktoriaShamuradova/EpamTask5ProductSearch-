package by.epamtc.shamuradova.good_search.service.search_refrigerator;

import by.epamtc.shamuradova.good_search.bean.Refrigerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SearcherRefrigerator {
    //изменить здесь вариации
    public List<Refrigerator> searchRefrigerator(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        List<Refrigerator> result = new ArrayList<>();
        if (refrigerator.getPowerConsumption() != 0 && refrigerator.getFreezerCapacity() != 0
                && refrigerator.getOverallCapacity() != 0 && refrigerator.getHeight() != 0 &&
                refrigerator.getWeight() != 0 && refrigerator.getWidth() != 0) {
            return searchByAllCharacteristics(refrigeratorList, refrigerator);
        }
        if (refrigerator.getPowerConsumption() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByPowerConsumption(refrigeratorList, refrigerator);
        }
        if (refrigerator.getWeight() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByWeight(refrigeratorList, refrigerator);
        }
        if (refrigerator.getFreezerCapacity() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByFreezerCapacity(refrigeratorList, refrigerator);
        }
        if (refrigerator.getOverallCapacity() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByOverallCapacity(refrigeratorList, refrigerator);
        }
        if (refrigerator.getHeight() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByHeight(refrigeratorList, refrigerator);
        }
        if (refrigerator.getWidth() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByWidth(refrigeratorList, refrigerator);
        }
        return result;
    }

    private List<Refrigerator> searchByWidth(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new WidthComparator());
    }

    private List<Refrigerator> searchByHeight(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new HeightComparator());
    }

    private List<Refrigerator> searchByOverallCapacity(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new OverallCapacityComparator());
    }

    private List<Refrigerator> searchByFreezerCapacity(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new FreezerCapacityComparator());
    }

    private List<Refrigerator> searchByWeight(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new WeightComparator());
    }

    private List<Refrigerator> searchByPowerConsumption(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        return search(refrigeratorList, refrigerator, new PowerConsumptionComparator());
    }

    private List<Refrigerator> searchByAllCharacteristics(List<Refrigerator> refrigeratorList, Refrigerator refrigerator) {
        List<Refrigerator> result = new ArrayList<>();

        for (Refrigerator r : refrigeratorList) {
            if (r.equals(refrigerator)) {
                result.add(r);
            }
        }
        return result;
    }

    private List<Refrigerator> search(List<Refrigerator> refrigeratorList, Refrigerator refrigerator, Comparator comparator) {
        List<Refrigerator> result = new ArrayList<>();

        for (Refrigerator r : refrigeratorList) {
            if (comparator.compare(r, refrigerator) == 0) {
                result.add(r);
            }
        }
        return result;
    }
}
