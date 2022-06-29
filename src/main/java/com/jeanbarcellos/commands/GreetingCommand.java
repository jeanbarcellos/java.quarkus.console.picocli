package com.jeanbarcellos.commands;

import javax.inject.Inject;

import com.jeanbarcellos.services.GreetingService;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "greet", mixinStandardHelpOptions = true, description = "Cumprimente a pessoa pelo nome")
public class GreetingCommand implements Runnable {

    @Option(names = { "-n", "--name" }, description = "Nome do usuário?", defaultValue = "Jean Barcellos")
    String name;

    @Inject
    GreetingService greetingService;

    @Override
    public void run() {
        System.out.println(greetingService.greeting(name));
    }
}