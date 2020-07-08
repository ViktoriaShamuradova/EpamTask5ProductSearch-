package by.epamtc.shamuradova.good_search.service.search_oven;

import by.epamtc.shamuradova.good_search.bean.Oven;

import java.util.Comparator;

public class WeightComparator implements Comparator<Oven> {

    @Override
    public int compare(Oven o1, Oven o2) {
        if (o1.getWeight() - o2.getWeight() > 0) return 1;
        if (o1.getWeight() - o2.getWeight() < 0) return -1;
        return 0;
    }
}
