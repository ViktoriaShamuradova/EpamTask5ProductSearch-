package by.epamtc.shamuradova.appliance_search.main;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.FindApplianceService;
import by.epamtc.shamuradova.appliance_search.service.exception.ServiceException;
import by.epamtc.shamuradova.appliance_search.service.impl.FindApplianceServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {

        FindApplianceService service = new FindApplianceServiceImpl();

        Criteria criteriaLaptop = new Criteria("Refrigerator");
        criteriaLaptop.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), 100.0);
        criteriaLaptop.add(SearchCriteria.Refrigerator.WEIGHT.toString(), 20.0);


        List<Appliance> appliances = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliances);




    }
}
