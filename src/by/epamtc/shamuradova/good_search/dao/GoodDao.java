package by.epamtc.shamuradova.good_search.dao;

import by.epamtc.shamuradova.good_search.bean.Good;

import java.util.List;

public interface GoodDao {

    boolean saveGood(Good good);

    List<Good> allGoods();

    void deleteGood();
}
