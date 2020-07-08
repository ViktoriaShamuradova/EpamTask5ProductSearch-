package by.epamtc.shamuradova.good_search.dao.impl;

import by.epamtc.shamuradova.good_search.bean.*;
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

        List<Good> listOfGoods = new ArrayList<>();

        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get(String.valueOf(fileName))))) {//указывем откуда мы собираемся читать данные
            boolean keepReading = true;                      //ObjectInputStream не знает, какой тип нужно возвращать и он всегда использует обжек
            while (keepReading) {                               //возможно появится ClassNotFoundEx. ObjectInputStream не знает, когда заканчивается файл
                Object o = input.readObject();//пока keepReading true, выполняем чтение из файла

                if(o instanceof Oven){
                    Oven oven = (Oven) o;
                    listOfGoods.add(oven);
                }
                if(o instanceof Laptop){
                    Laptop laptop = (Laptop) o;
                    listOfGoods.add(laptop);
                }
                if(o instanceof Refrigerator){
                    Refrigerator refrigerator = (Refrigerator) o;
                    listOfGoods.add(refrigerator);
                }
                if(o instanceof Speakers){
                    Speakers speakers = (Speakers) o;
                    listOfGoods.add(speakers);
                }
                if(o instanceof TablePC){
                    TablePC tablePC = (TablePC) o;
                    listOfGoods.add(tablePC);
                }
                if(o instanceof VacuumCleaner){
                    VacuumCleaner vacuumCleaner = (VacuumCleaner) o;
                    listOfGoods.add(vacuumCleaner);
                }
                if (o instanceof Mark) {
                    keepReading = false;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new ReaderException(e);
        }
        return listOfGoods;
    }

    public static void main(String[] args) {
        ReaderGoodsFromFile readerGoodsFromFile = new ReaderGoodsFromFile();
        File file = new File("Goods.bin");
        List<Good> list = readerGoodsFromFile.readGoodsFromFile(file);
        System.out.println(list);

    }

}
