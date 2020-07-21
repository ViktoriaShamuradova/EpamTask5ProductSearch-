package by.epamtc.shamuradova.appliance_search.main.command.provider;

import by.epamtc.shamuradova.appliance_search.main.command.Command;
import by.epamtc.shamuradova.appliance_search.main.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new PrintOvenCommand());
        commands.put(CommandName.LAPTOP, new PrintLaptopCommand());
        commands.put(CommandName.REFRIGERATOR, new PrintRefrigeratorCommand());
        commands.put(CommandName.VACUUMCLEANER, new PrintVacuumCleanerCommand());
        commands.put(CommandName.TABLETPC, new PrintTablePCCommand());
        commands.put(CommandName.SPEAKERS, new PrintSpeakersCommand());
    }

    public Command takeCommand(String command) {
        CommandName commandName;
        Command value;

        try {
            commandName = CommandName.valueOf(command.toUpperCase());
            value = commands.get(commandName);
        } catch (IllegalArgumentException e) {
            value = commands.get(CommandName.NO_SUCH_APPLIANCE);
        }
        return value;
    }
}
