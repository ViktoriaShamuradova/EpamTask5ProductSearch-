package by.epamtc.shamuradova.good_search.dao.impl;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.bean.Oven;
import by.epamtc.shamuradova.good_search.dao.GoodDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileGoodDaoImpl implements GoodDao {

    private File goodsFile;
    private WriterGoodInFile writer;
    private List<Good> listOfGoods;

    public FileGoodDaoImpl() {
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

    private static List<Good> readAllBooks() throws IOException, ClassNotFoundException {
        File file = new File("Goods.bin");
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(String.valueOf(file))));
        Object o = ois.readObject();
        if(o instanceof Oven){
            Oven ov = (Oven)o;
            System.out.println(ov);
        }

        return null;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readAllBooks();
    }
}
