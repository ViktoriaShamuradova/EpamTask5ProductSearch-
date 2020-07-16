package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl;

import by.epamtc.shamuradova.appliance_search.dao.exception.ReaderException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ReaderTxtFile {
//перегрузить методы, чтобы возвращал все стринги, все стринги конкретного товара например
    List<String> read(File file) throws ReaderException {

        List<String> txtLines = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                txtLines.add(line);
            }
        } catch (IOException e) {
            throw new ReaderException("problems with file", e);
        }
        return txtLines;
    }
}
