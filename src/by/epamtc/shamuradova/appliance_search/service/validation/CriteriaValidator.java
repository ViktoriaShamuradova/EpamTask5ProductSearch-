package by.epamtc.shamuradova.appliance_search.service.validation;

import by.epamtc.shamuradova.appliance_search.entity.*;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;

public class CriteriaValidator {

    public static boolean checkCriteria(Criteria criteria) {
        String searchName = criteria.getSearchName();

        if (searchName.equalsIgnoreCase(Laptop.class.getSimpleName())) {

            return LaptopValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase(Oven.class.getSimpleName())) {

            return OvenValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase(Refrigerator.class.getSimpleName())) {

            return RefrigeratorValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase(VacuumCleaner.class.getSimpleName())) {

            return VacuumCleanerValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase(TablePC.class.getSimpleName())) {

            return TabletPCValidator.check(criteria);
        }
        if (searchName.equalsIgnoreCase(Speakers.class.getSimpleName())) {

            return SpeakersValidator.check(criteria);
        }

        return false;
    }
}
