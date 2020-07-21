package by.epamtc.shamuradova.appliance_search.service.validation.command.provider;

import by.epamtc.shamuradova.appliance_search.service.validation.command.Command;
import by.epamtc.shamuradova.appliance_search.service.validation.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new OvenValidatorCommand());
        commands.put(CommandName.LAPTOP, new LaptopValidatorCommand());
        commands.put(CommandName.REFRIGERATOR, new RefrigeratorValidatorCommand());
        commands.put(CommandName.VACUUMCLEANER, new VacuumCleanerValidatorCommand());
        commands.put(CommandName.TABLETPC, new TabletPCValidator());
        commands.put(CommandName.SPEAKERS, new SpeakersValidatorCommand());
        commands.put(CommandName.NO_SUCH_APPLIANCE, new NoSuchCommandValidatorCommand());
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
