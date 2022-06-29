package com.jeanbarcellos.commands;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine;

@TopCommand
@CommandLine.Command(mixinStandardHelpOptions = true, subcommands = {
        MakeEntityCommand.class,
        MakeServiceCommand.class,
        MakeResourceCommand.class
})
public class EntryCommand {
}
