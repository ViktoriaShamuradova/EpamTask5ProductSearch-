package by.epamtc.shamuradova.good_search.service;

import by.epamtc.shamuradova.good_search.bean.Good;

import java.util.List;
import java.util.NavigableSet;

public interface GoodService {
    boolean addGood(Good good);

    List<Good> allGoods();

    List<Good> searchGood(Good good);
}
