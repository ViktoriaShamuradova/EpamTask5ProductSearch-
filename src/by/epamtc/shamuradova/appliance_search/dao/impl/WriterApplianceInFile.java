package by.epamtc.shamuradova.appliance_search.dao.impl;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Laptop;
import by.epamtc.shamuradova.appliance_search.entity.Oven;
import by.epamtc.shamuradova.appliance_search.entity.Refrigerator;
import by.epamtc.shamuradova.appliance_search.dao.exception.WriterException;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class WriterApplianceInFile {

    void writeAppliance (List<Appliance> listOfAppliance, File fileName) throws WriterException {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(String.valueOf(fileName))))) {
            out.writeObject(listOfAppliance);
        } catch (IOException e) {
            throw new WriterException("File cannot be open.");
        }
    }

    public static void main(String[] args) throws WriterException {
        List<Appliance> listOfAppliance = new ArrayList<>();

        listOfAppliance.add(new Oven(1000, 10, 32, 60, 45.5, 59.5));
        listOfAppliance.add(new Oven(1500, 12, 33, 60, 45, 68));
        listOfAppliance.add(new Oven(2000, 11, 33, 60, 40, 70));

        listOfAppliance.add(new Laptop(1, "Windows", 4000, 1000, 1.2, 18));
        listOfAppliance.add(new Laptop(1.5, "Linux", 8000, 1000, 2.2, 19));
        listOfAppliance.add(new Laptop(3, "Windows", 4000, 1500, 3.2, 22));

        listOfAppliance.add(new Refrigerator(100, 20, 10, 300, 200, 70));
        listOfAppliance.add(new Refrigerator(200, 30, 15, 300, 180, 80));
        listOfAppliance.add(new Refrigerator(150, 35, 20, 350.5, 250, 75));

        File file = new File("Goods.bin");

        WriterApplianceInFile writerGoodInFile = new WriterApplianceInFile();
        writerGoodInFile.writeAppliance(listOfAppliance, file);

    }
}

