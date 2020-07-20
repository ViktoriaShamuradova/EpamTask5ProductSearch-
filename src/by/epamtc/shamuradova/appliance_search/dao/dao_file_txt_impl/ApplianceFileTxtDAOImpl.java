package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.provider.CommandProvider;
import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceFileTxtDAOImpl implements ApplianceDAO {

    private File applianceFile = new File("resources/appliances_db.txt");
    private WriterApplianceInTxtFile writer = new WriterApplianceInTxtFile();
    private ReaderTxtFile reader = new ReaderTxtFile();


    @Override
    public List<Appliance> allAppliance() throws DAOException {
        return null;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        String regexStart = "\\s";
        String regexEnd = "[\\W\\S]";

        List<Appliance> searchResults = new ArrayList<>();

        CommandProvider commandProvider = new CommandProvider();
        Command command = commandProvider.takeCommand(criteria.getSearchName());

        List<String> appliances = reader.read(applianceFile);//все строки здесь, исправить, чтобы были только по searchName
        ParserStringLines parserStringLines = new ParserStringLines();

        String searchName = criteria.getSearchName();
        Map<String, Object> criteriaMap = criteria.getCriteria();

        for (String line : appliances) {
            for (Map.Entry<String, Object> item : criteriaMap.entrySet()) {

                String regexToParse = regexStart + item.getKey() + DefaultSeparators.FOR_VALUES_OF_PROPERTIES + item.getValue() + regexEnd;
                String result = parserStringLines.findLines(line, regexToParse, searchName);

                if (!result.isEmpty()) {
                    String withoutName = line.substring(line.indexOf(DefaultSeparators.FOR_APPLIANCE_NAME) + 1);
                    String[] properties = withoutName.trim().split(DefaultSeparators.BETWEEN_PROPERTIES);

                    //мэп, который модержит ключ - свойство устройства, value - значение этого свойства, чтобы через команду создать объект
                    Map<String, String> propertiesAndValues = new HashMap<>();
                    for (String property : properties) {
                        String[] propertyAndValue = property.split(DefaultSeparators.FOR_VALUES_OF_PROPERTIES);
                        propertiesAndValues.put(propertyAndValue[0], propertyAndValue[1]);
                    }

                    searchResults.add(command.execute(propertiesAndValues));
                }
            }
        }
        return searchResults;
    }

}
