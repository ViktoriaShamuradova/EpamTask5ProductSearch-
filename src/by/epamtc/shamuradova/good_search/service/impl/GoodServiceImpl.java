package by.epamtc.shamuradova.good_search.service.impl;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.bean.Laptop;
import by.epamtc.shamuradova.good_search.bean.Oven;
import by.epamtc.shamuradova.good_search.bean.Refrigerator;
import by.epamtc.shamuradova.good_search.dao.GoodDao;
import by.epamtc.shamuradova.good_search.dao.dao_factory.DaoFactory;
import by.epamtc.shamuradova.good_search.service.GoodService;
import by.epamtc.shamuradova.good_search.service.search_laptop.SearcherLaptop;
import by.epamtc.shamuradova.good_search.service.search_oven.SearcherOven;
import by.epamtc.shamuradova.good_search.service.search_refrigerator.SearcherRefrigerator;

import java.util.ArrayList;
import java.util.List;


public class GoodServiceImpl implements GoodService {

    private DaoFactory daoFactory = DaoFactory.getInstance();
    private GoodDao goodDao = daoFactory.getGoodDao();

    public GoodServiceImpl() {

    }

    @Override
    public List<Good> searchGood(Good good) {
        List<Good> goods = goodDao.allGoods();
        if (good instanceof Oven) {
            SearcherOven searcherOven = new SearcherOven();
            Oven oven = (Oven) good;
            List<Oven> ovens = takeOvens(goods);
            List<Oven> ovensRes = searcherOven.searchOven(ovens, oven);
            return new ArrayList<>(ovensRes);
        }
        if (good instanceof Laptop) {
            SearcherLaptop searcherLaptop = new SearcherLaptop();
            Laptop laptop = (Laptop) good;
            List<Laptop> laptops = takeLaptops(goods);
            List<Laptop> laptops1 = searcherLaptop.searchLaptop(laptops, laptop);
            return new ArrayList<>(laptops1);

        }
        if (good instanceof Refrigerator) {
            SearcherRefrigerator searcherRefrigerator = new SearcherRefrigerator();
            Refrigerator refrigerator = (Refrigerator) good;
            List<Refrigerator> refrigerators = takeRefrigerators(goods);
            List<Refrigerator> refrigerators1 = searcherRefrigerator.searchRefrigerator(refrigerators, refrigerator);
            return new ArrayList<>(refrigerators1);
        }
        return null;
    }


    @Override
    public boolean addGood(Good good) {
        return false;
    }

    @Override
    public List<Good> allGoods() {
        return goodDao.allGoods();
    }

    private List<Oven> takeOvens(List<Good> goods) {
        List<Oven> ovens = new ArrayList<>();
        for (Good good : goods) {
            if (good instanceof Oven) {
                Oven oven = (Oven) good;
                ovens.add(oven);
            }
        }
        return ovens;
    }

    private List<Laptop> takeLaptops(List<Good> goods) {
        List<Laptop> laptops = new ArrayList<>();
        for (Good good : goods) {
            if (good instanceof Laptop) {
                Laptop laptop = (Laptop) good;
                laptops.add(laptop);
            }
        }
        return laptops;
    }

    private List<Refrigerator> takeRefrigerators(List<Good> goods) {
        List<Refrigerator> refrigerators = new ArrayList<>();
        for (Good good : goods) {
            if (good instanceof Refrigerator) {
                Refrigerator refrigerator = (Refrigerator) good;
                refrigerators.add(refrigerator);
            }
        }
        return refrigerators;
    }


}
