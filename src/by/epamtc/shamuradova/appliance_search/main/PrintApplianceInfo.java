package by.epamtc.shamuradova.appliance_search.main;


import by.epamtc.shamuradova.appliance_search.entity.*;
import by.epamtc.shamuradova.appliance_search.main.command.Command;
import by.epamtc.shamuradova.appliance_search.main.command.provider.CommandProvider;

import java.util.List;


public class PrintApplianceInfo {
    public static void print(List<Appliance> appliances) {
        CommandProvider commandProvider = new CommandProvider();

        if(appliances!=null){
            for(Appliance apl: appliances){
                Command command = commandProvider.takeCommand(apl.getClass().getSimpleName());
                command.execute(apl);
            }
        }
    }
}
