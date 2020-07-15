package by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.command.impl;

import by.epamtc.shamuradova.appliance_search.dao.dao_file_bin_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindLaptopCommand implements Command {

    @Override
    public List<Appliance> execute(Criteria criteria, List<Appliance> appliances) {
        String searchName = criteria.getSearchName();
        Map<String, Object> criteria1 = criteria.getCriteria();

        List<Appliance> laptopsList = new ArrayList<>();


        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase(searchName)) {


                Map<String, Object> characteristics = appliance.getCharacteristics();

                for (Map.Entry<String, Object> characteristic : characteristics.entrySet()) {

                    for (Map.Entry<String, Object> criteriaItem : criteria1.entrySet()) {
                        if (characteristic.getKey().equalsIgnoreCase(criteriaItem.getKey())) {

                            if (characteristic.getValue() instanceof Integer && criteriaItem.getValue() instanceof Integer) {
                                Integer integer1 = (Integer) characteristic.getValue();
                                Integer integer2 = (Integer) criteriaItem.getValue();

                                if (integer1.equals(integer2)) {
                                    laptopsList.add(appliance);
                                }
                            }
                            if (characteristic.getValue() instanceof Double && criteriaItem.getValue() instanceof Double) {
                                Double double1 = (Double) characteristic.getValue();
                                Double double2 = (Double) criteriaItem.getValue();

                                if (double1.equals(double2)) {
                                    laptopsList.add(appliance);
                                }
                            }
                            if (characteristic.getValue() instanceof Character && criteriaItem.getValue() instanceof Character) {
                                Character character1 = (Character) characteristic.getValue();
                                Character character2 = (Character) criteriaItem.getValue();

                                if (character1.equals(character2)) {
                                    laptopsList.add(appliance);
                                }
                            }
                            if (characteristic.getValue() instanceof String && criteriaItem.getValue() instanceof String) {
                                String string1 = (String) characteristic.getValue();
                                String string2 = (String) criteriaItem.getValue();

                                if (string1.equals(string2)) {
                                    laptopsList.add(appliance);
                                }
                            }
                        }
                    }
                }

            }

        }

        return laptopsList;
    }
}
