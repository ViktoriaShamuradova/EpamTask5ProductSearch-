package by.epamtc.shamuradova.appliance_search.main;

import by.epamtc.shamuradova.appliance_search.entity.*;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliance) {
        for(Appliance appliance1 : appliance) {
            System.out.println(appliance1);
        }
    }
}
