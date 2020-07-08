package by.epamtc.shamuradova.good_search.dao.impl;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.dao.GoodDao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GoodDaoImpl implements GoodDao {

    private File goodsFile;
    private WriterGoodInFile writer;
    private List<Good> listOfGoods;

    public GoodDaoImpl() {
        writer = new WriterGoodInFile();
        ReaderGoodsFromFile reader = new ReaderGoodsFromFile();
        goodsFile = new File("Goods.bin");
        listOfGoods = reader.readGoodsFromFile(goodsFile);
    }

    @Override
    public boolean saveGood(Good good) {
        return false;
    }

    @Override
    public List<Good> allGoods() {
        return new ArrayList<>(listOfGoods);
    }

    @Override
    public void deleteGood() {

    }
}
