package by.epamtc.shamuradova.appliance_search.dao.command.provider;

import by.epamtc.shamuradova.appliance_search.dao.command.Command;
import by.epamtc.shamuradova.appliance_search.dao.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new FindOvenCommand());
        commands.put(CommandName.LAPTOP, new FindLaptopCommand());
        commands.put(CommandName.REFRIGERATOR, new FindRefrigeratorCommand());
        commands.put(CommandName.VACUUMCLEANER, new FindVacuumCleaner());
        commands.put(CommandName.TABLETPC, new FindTabletPCommand());
        commands.put(CommandName.SPEAKERS, new FindSpeakersCommand());
        commands.put(CommandName.NO_SUCH_APPLIANCE, new NoSuchApplianceCommand());

    }

    public Command takeCommand(String command) {
        CommandName commandName;
        Command value;
        try {
            commandName = CommandName.valueOf(command.toUpperCase()); //когда valueOf сгенерирует исключение IllegalArgumentException, используется No_Such
            value = commands.get(commandName);
        } catch (IllegalArgumentException e) {
            value = commands.get(CommandName.NO_SUCH_APPLIANCE);
        }
        return value;
    }
}
