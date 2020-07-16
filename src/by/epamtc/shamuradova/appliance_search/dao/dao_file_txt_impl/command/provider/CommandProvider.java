package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.provider;

import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.Command;
import by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new CreateOvenCommand());
        commands.put(CommandName.NO_SUCH_APPLIANCE, new CreateNoSuchCommand());
        commands.put(CommandName.LAPTOP, new CreateLaptopCommand());
        commands.put(CommandName.REFRIGERATOR, new CreateRefrigeratorCommand());
        commands.put(CommandName.TABLEPC, new CreateTablePcCommand());
        commands.put(CommandName.SPEAKERS, new CreateSpeakersCommand());
        commands.put(CommandName.VACUUMCLEANER, new CreateVacuumCleanerCommand());
    }

    public Command takeCommand(String command) {
        CommandName commandName;
        Command value;

        try {
            commandName = CommandName.valueOf(command.toUpperCase());
            value = commands.get(commandName);

        } catch (IllegalArgumentException e) {
            value = commands.get(CommandName.NO_SUCH_APPLIANCE);
            return value;
        }
        return value;

    }
}
