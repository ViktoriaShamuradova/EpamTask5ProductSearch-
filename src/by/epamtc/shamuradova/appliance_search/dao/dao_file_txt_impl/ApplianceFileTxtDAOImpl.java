package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.io.File;
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

        ParserStringLines parserStringLines = new ParserStringLines();

        List<String> appliances = reader.read(applianceFile);

        String searchName = criteria.getSearchName();
        Map<String, Object> criteriaMap = criteria.getCriteria();


        for (String line : appliances) {
            for (Map.Entry<String, Object> item : criteriaMap.entrySet()) {

                StringBuilder lines = parserStringLines.findLines(line, regexStart + item.getKey() + "=" + item.getValue() + regexEnd, searchName);
                String result = new String(lines);
                if (!result.isEmpty()) {
                    //делаем что-нибудь, чтобы создать объекты устройств
                    //System.out.println(result);
                }

            }
        }
        return null;
    }
}
