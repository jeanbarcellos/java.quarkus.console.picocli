package com.jeanbarcellos.commands;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine;

@TopCommand
@CommandLine.Command(
    mixinStandardHelpOptions = true,
    subcommands = {
        GreetingCommand.class,
        HelloCommand.class,
        GoodByeCommand.class
    }
)
public class EntryCommand {
}
