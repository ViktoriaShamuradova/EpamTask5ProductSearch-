package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;

import java.util.Arrays;

public class CriteriaValidator {

    public static boolean checkCriteria(Criteria criteria) {
        String searchName = criteria.getSearchName();


        if (searchName.equalsIgnoreCase("Laptop")) {

            return LaptopValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase("Oven")) {

            return OvenValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase("Refrigerator")) {

            return RefrigeratorValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase("VacuumCleaner")) {

            return VacuumCleanerValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase("TablePC")) {

            return TabletPCValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase("Speakers")) {

            return SpeakersValidator.check(criteria);
        }

        return false;
    }

    public static void main(String[] args) {

        Class<?>[] classes = SearchCriteria.class.getClasses();
        String[] result = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            String string = classes[i].toString();
            int pos = string.indexOf('$');
            String res = string.substring(pos + 1);
            result[i] = res;
        }
        System.out.println("________________");
        System.out.println(Arrays.toString(result));


    }
}
