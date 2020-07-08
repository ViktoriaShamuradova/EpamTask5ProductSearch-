package by.epamtc.shamuradova.good_search.dao.impl;

import by.epamtc.shamuradova.good_search.bean.Good;
import by.epamtc.shamuradova.good_search.bean.Laptop;
import by.epamtc.shamuradova.good_search.bean.Oven;
import by.epamtc.shamuradova.good_search.bean.Refrigerator;
import by.epamtc.shamuradova.good_search.dao.exception.WriterException;
import com.sun.org.apache.regexp.internal.RE;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class WriterGoodInFile {

    void writeGoodsToFile(List<Good> listOfGoods, File fileName) {                                                      //записывем объекты в бинарные файлы, то есть они не текстовые и читать их с помощбю текстового редактора невозможно, будет аброкодабра, чтобы сохранить объект, он должен быть сериализиремый
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(String.valueOf(fileName))))) { //ObjectOutPutStream умеет сериализовать объекты, но ему неизвесто, куда мы собираемся отправлять эти объекты(по сети или сохранить в файл, поэтому должны указать внутренний стрим, который мы будем использовать для сохранения наших объетов, то есть ObjectOutPutStream обернет переданный стрим в конструктор и используя его выполнит сериализацию и отправку, также этот класс отвечает за проверку того, что наш объект сериализуемый
            for (Good product : listOfGoods) {                                                                                  // то есть создаем стрим для сохранения объетокв, для этого понадобится класс Files.newOutputStream возвращает OutputStream, а ему в свою очередь понадобятся координаты нашего файла, как минимум нужно указать имя файла
                out.writeObject(product);
            }
            out.writeObject(Mark.getInstance());
        } catch (IOException e) {
            throw new WriterException("File cannot be open.");
        }
    }
    public static void main(String [] args){
        List<Good> listOfGoods = new ArrayList<>();

        listOfGoods.add(new Oven(1000, 10, 32, 60, 45.5, 59.5));
        listOfGoods.add(new Oven(1500, 12, 33, 60, 45, 68));
        listOfGoods.add(new Oven(2000, 11, 33, 60, 40, 70));

        listOfGoods.add(new Laptop(1, "Windows", 4000, 1000, 1.2, 18));
        listOfGoods.add(new Laptop(1.5, "Linux", 8000, 1000, 2.2, 19));
        listOfGoods.add(new Laptop(3, "Windows", 4000, 1500, 3.2, 22));

        listOfGoods.add(new Refrigerator(100, 20, 10, 300, 200, 70));
        listOfGoods.add(new Refrigerator(200, 30, 15, 300, 180, 80));
        listOfGoods.add(new Refrigerator( 150, 35, 20, 350.5, 250, 75));

        File file = new File("Goods.bin");

        WriterGoodInFile writerGoodInFile = new WriterGoodInFile();
        writerGoodInFile.writeGoodsToFile(listOfGoods, file);

    }

}

class Mark extends Good {
    private final String MARKSTR = "1111";
    private final boolean MARKBOOL = false;

    private Mark() {
    }

    private static final Mark INSTANCE = new Mark();

    static Mark getInstance() {
        return INSTANCE;
    }

}
