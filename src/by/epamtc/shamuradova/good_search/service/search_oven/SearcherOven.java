package by.epamtc.shamuradova.good_search.service.search_oven;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.bean.Oven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SearcherOven {

    //изменить здесь вариации
    public List<Oven> searchOven(List<Oven> ovenList, Oven oven) {
        List<Oven> result = new ArrayList<>();
        if (oven.getPowerConsumption() != 0 && oven.getCapacity() != 0
                && oven.getDepth() != 0 && oven.getHeight() != 0 && oven.getWeight() != 0 && oven.getWidth() != 0) {
            return searchByAllCharacteristics(ovenList, oven);
        }
        if (oven.getPowerConsumption() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByPowerConsumption(ovenList, oven);
        }
        if (oven.getWeight() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByWeight(ovenList, oven);
        }
        if (oven.getCapacity() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByCapacity(ovenList, oven);
        }
        if (oven.getDepth() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByDepth(ovenList, oven);
        }
        if (oven.getHeight() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByHeight(ovenList, oven);
        }
        if (oven.getWidth() != 0) { //ожидаеся, что остальные показатели не введены
            return searchByWidth(ovenList, oven);
        }
        return result;
    }

    private List<Oven> searchByWidth(List<Oven> ovenList, Oven oven) {
        return search(ovenList, oven, new WidthComparator());
    }

    private List<Oven> searchByHeight(List<Oven> ovenList, Oven oven) {
        return search(ovenList, oven, new HeightComparator());

    }

    private List<Oven> searchByDepth(List<Oven> ovenList, Oven oven) {
       return search(ovenList, oven, new DepthComparator());
    }

    private List<Oven> searchByCapacity(List<Oven> ovenList, Oven oven) {
       return search(ovenList, oven, new CapacityComparator());
    }

    private List<Oven> searchByWeight(List<Oven> ovenList, Oven oven) {
        return search(ovenList, oven, new WeightComparator());
    }


    private List<Oven> searchByPowerConsumption(List<Oven> ovenList, Oven oven) {
        return search(ovenList, oven, new PowerConsumptionComparator());
    }

    private List<Oven> searchByAllCharacteristics(List<Oven> ovenList, Oven oven) {
        List<Oven> result = new ArrayList<>();

        for (Oven ov : ovenList) {
            if (ov.equals(oven)) {
                result.add(ov);
            }
        }
        return result;
    }
    private List<Oven> search(List<Oven> ovens, Oven oven, Comparator comparator) {
        List<Oven> result = new ArrayList<>();

        for (Oven ov : ovens) {
            if (comparator.compare(ov, oven) == 0) {
                    result.add(ov);
            }
        }
        return result;
    }

}
