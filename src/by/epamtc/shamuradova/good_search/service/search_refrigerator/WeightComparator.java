package by.epamtc.shamuradova.good_search.service.search_refrigerator;


import by.epamtc.shamuradova.good_search.bean.Refrigerator;

import java.util.Comparator;

public class WeightComparator implements Comparator<Refrigerator> {
    @Override
    public int compare(Refrigerator o1, Refrigerator o2) {
        if (o1.getWeight() - o2.getWeight() > 0) return 1;
        if (o1.getWeight() - o2.getWeight() < 0) return -1;
        return 0;
    }
}
