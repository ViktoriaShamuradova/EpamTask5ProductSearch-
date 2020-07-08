package by.epamtc.shamuradova.good_search.service.search_laptop;

import by.epamtc.shamuradova.good_search.bean.Laptop;

import java.util.Comparator;

public class OsComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        if (o1.getOs().compareTo(o1.getOs()) > 0) return 1;
        if (o1.getOs().compareTo(o1.getOs()) < 0) return -1;
        return 0;
    }
}
