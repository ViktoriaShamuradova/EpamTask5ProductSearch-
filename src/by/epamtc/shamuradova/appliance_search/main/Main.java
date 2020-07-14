package by.epamtc.shamuradova.appliance_search.main;

import by.epamtc.shamuradova.appliance_search.entity.Appliance;
import by.epamtc.shamuradova.appliance_search.entity.Laptop;
import by.epamtc.shamuradova.appliance_search.entity.criteria.Criteria;
import by.epamtc.shamuradova.appliance_search.entity.criteria.SearchCriteria;
import by.epamtc.shamuradova.appliance_search.service.FindApplianceService;
import by.epamtc.shamuradova.appliance_search.service.exception.ServiceException;
import by.epamtc.shamuradova.appliance_search.service.impl.FindApplianceServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {

        FindApplianceService service = new FindApplianceServiceImpl();

        Criteria criteriaLaptop = new Criteria("Laptop"); //"Oven"
        criteriaLaptop.add(SearchCriteria.Laptop.OS.toString(), "Windows");

        List<Appliance> appliances = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliances);



    }
}
