package by.epamtc.shamuradova.appliance_search.main;

import by.epamtc.shamuradova.appliance_search.entity.*;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliance) {
        for(Appliance appliance1 : appliance) {
            if(appliance1 instanceof Oven){
                Oven oven = (Oven)appliance1;
                System.out.println(oven);

            }
            if(appliance1 instanceof Laptop){
                Laptop laptop = (Laptop) appliance1;
                System.out.println(laptop);

            }
            if(appliance1 instanceof Refrigerator){
                Refrigerator refrigerator = (Refrigerator) appliance1;
                System.out.println(refrigerator);

            }
            if(appliance1 instanceof VacuumCleaner){
                VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance1;
                System.out.println(vacuumCleaner);

            }
            if(appliance1 instanceof TabletPC){
                TabletPC tabletPC = (TabletPC) appliance1;
                System.out.println(tabletPC);

            }
            if(appliance1 instanceof Speakers){
                Speakers speakers = (Speakers) appliance1;
                System.out.println(speakers);

            }
        }
    }
}
