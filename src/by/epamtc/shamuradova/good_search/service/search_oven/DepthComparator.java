package by.epamtc.shamuradova.good_search.service.search_oven;

import by.epamtc.shamuradova.good_search.bean.Oven;

import java.util.Comparator;

public class DepthComparator implements Comparator<Oven> {
    @Override
    public int compare(Oven o1, Oven o2) {
        if (o1.getDepth() - o2.getDepth() > 0) return 1;
        if (o1.getDepth() - o2.getDepth() < 0) return -1;
        return 0;
    }
}
