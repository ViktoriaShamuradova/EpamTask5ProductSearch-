package by.epamtc.shamuradova.good_search.dao.impl;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.dao.exception.ReaderException;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderGoodsFromFile {

    public List<Good> readGoodsFromFile(File fileName) {

        List<Good> listOfGoods;

        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get(String.valueOf(fileName))))) {
            Object o = input.readObject();
            listOfGoods = (ArrayList<Good>) o;

        } catch (IOException | ClassNotFoundException e) {
            throw new ReaderException(e);
        }
        return listOfGoods;
    }

}
