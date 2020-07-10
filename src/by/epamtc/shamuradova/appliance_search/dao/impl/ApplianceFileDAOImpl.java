package by.epamtc.shamuradova.appliance_search.dao.impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApplianceFileDAOImpl implements ApplianceDAO {

    private File goodsFile;
    private WriterGoodInFile writer;
    private List<Appliance> listOfGoods;

    public ApplianceFileDAOImpl() {
        writer = new WriterGoodInFile();
        ReaderGoodsFromFile reader = new ReaderGoodsFromFile();
        goodsFile = new File("Goods.bin");
        listOfGoods = reader.readGoodsFromFile(goodsFile);
    }


    @Override
    public List<Appliance> allAppliance() {
        return new ArrayList<>(listOfGoods);
    }

    @Override
    public Appliance find(Criteria criteria) {
        return null;
    }
}
