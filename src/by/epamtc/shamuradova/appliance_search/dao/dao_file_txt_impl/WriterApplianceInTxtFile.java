package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl;

import by.epamtc.shamuradova.appliance_search.dao.exception.WriterException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

//вывести название устройства
class WriterApplianceInTxtFile {

    static void write(List<Appliance> applianceList, File file) throws WriterException {


        for (Appliance appliance : applianceList) {
            Map<String, Object> characteristics = appliance.getCharacteristics();

            try (PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(file), true))) {

                for (Map.Entry<String, Object> item : characteristics.entrySet()) {
                    writer.write(item.getKey() + " = " + item.getValue() + "; ");
                }
                writer.write("\n");
            } catch (IOException e) {
                throw new WriterException(e);
            }
        }

    }
}
