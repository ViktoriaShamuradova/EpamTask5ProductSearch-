package by.epamtc.shamuradova.good_search;

import by.epamtc.shamuradova.good_search.bean.Oven;
import by.epamtc.shamuradova.good_search.service.GoodService;
import by.epamtc.shamuradova.good_search.service.impl.GoodServiceImpl;

public class Main {
    public static void main(String[] args) {
        GoodService goodService = new GoodServiceImpl();
        System.out.println(goodService.allGoods());
        Oven oven = new Oven(1000, 10, 32, 60, 45.5, 59.5);
        //oven.setPowerConsumption(1000);
        System.out.println(goodService.searchGood(oven));

    }
}
