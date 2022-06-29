package com.jeanbarcellos.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "make:service", description = "Criar nova classe do tipo Service")
public class MakeServiceCommand implements Runnable {

    @Option(names = { "-n", "--name" }, description = "Nome do arquivo", required = true)
    String name;

    @Override
    public void run() {
        System.out.println(String.format("Gerar arquivo %sService", name));
    }
}