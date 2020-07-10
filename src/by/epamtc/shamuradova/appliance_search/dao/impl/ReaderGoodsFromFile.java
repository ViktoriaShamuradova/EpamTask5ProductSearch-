package by.epamtc.shamuradova.appliance_search.dao.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.dao.exception.ReaderException;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderGoodsFromFile {

    public List<Appliance> readGoodsFromFile(File fileName) {

        List<Appliance> listOfGoods;

        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get(String.valueOf(fileName))))) {
            Object o = input.readObject();
            listOfGoods = (ArrayList<Appliance>) o;

        } catch (IOException | ClassNotFoundException e) {
            throw new ReaderException(e);
        }
        return listOfGoods;
    }

}
