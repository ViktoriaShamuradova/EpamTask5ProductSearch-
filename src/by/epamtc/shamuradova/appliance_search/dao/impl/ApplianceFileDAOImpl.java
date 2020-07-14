package by.epamtc.shamuradova.appliance_search.dao.impl;

import by.epamtc.shamuradova.appliance_search.dao.ApplianceDAO;
import by.epamtc.shamuradova.appliance_search.dao.exception.DAOException;
import by.epamtc.shamuradova.appliance_search.dao.exception.ReaderException;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Laptop;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.main.PrintApplianceInfo;
import by.epamtc.shamuradova.appliance_search.service.FindApplianceService;
import by.epamtc.shamuradova.appliance_search.service.exception.ServiceException;
import by.epamtc.shamuradova.appliance_search.service.impl.FindApplianceServiceImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceFileDAOImpl implements ApplianceDAO {

    private File applianceFile = new File("Goods.bin");
    private WriterApplianceInFile writer = new WriterApplianceInFile();
    ReaderApplianceFromFile reader = new ReaderApplianceFromFile();

    public ApplianceFileDAOImpl() {

    }


    @Override
    public List<Appliance> allAppliance() throws DAOException {
        try {
            return reader.readAppliance(applianceFile);
        } catch (ReaderException e) {
            throw new DAOException();
        }
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        String searchName = criteria.getSearchName();
        Map<String, Object> criteria1 = criteria.getCriteria();

        List<Appliance> appliances = allAppliance();
        List<Appliance> applianceList = new ArrayList<>();


        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equals(searchName)) {

                if (appliance instanceof Laptop) {
                    Laptop laptop = (Laptop) appliance;
                    Map<String, Object> characteristics = laptop.getCharacteristics();

                    for (Map.Entry<String, Object> characteristic : characteristics.entrySet()) {

                        for (Map.Entry<String, Object> criteriaItem : criteria1.entrySet()) {
                            if (characteristic.getKey().equalsIgnoreCase(criteriaItem.getKey())) {

                                if (characteristic.getValue() instanceof Integer && criteriaItem.getValue() instanceof Integer) {
                                    Integer integer1 = (Integer) characteristic.getValue();
                                    Integer integer2 = (Integer) criteriaItem.getValue();

                                    if (integer1.equals(integer2)) {
                                        applianceList.add(appliance);
                                    }
                                }
                                if (characteristic.getValue() instanceof Double && criteriaItem.getValue() instanceof Double) {
                                    Double double1 = (Double) characteristic.getValue();
                                    Double double2 = (Double) criteriaItem.getValue();

                                    if (double1.equals(double2)) {
                                        applianceList.add(appliance);
                                    }
                                }
                                if (characteristic.getValue() instanceof Character && criteriaItem.getValue() instanceof Character) {
                                    Character character1 = (Character) characteristic.getValue();
                                    Character character2 = (Character) criteriaItem.getValue();

                                    if (character1.equals(character2)) {
                                        applianceList.add(appliance);
                                    }
                                }
                                if (characteristic.getValue() instanceof String && criteriaItem.getValue() instanceof String) {
                                    String string1 = (String) characteristic.getValue();
                                    String string2 = (String) criteriaItem.getValue();

                                    if (string1.equals(string2)) {
                                        applianceList.add(appliance);
                                    }
                                }
                            }
                        }
                    }

                }

            }
        }
        return applianceList;
    }

    public static void main(String[] args) throws ServiceException {
        FindApplianceService service = new FindApplianceServiceImpl();

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName()); //"Oven"
        criteriaLaptop.add(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), 1.0);

        List<Appliance> appliances = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliances);


    }
}
