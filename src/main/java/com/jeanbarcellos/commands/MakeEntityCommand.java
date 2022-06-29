package com.jeanbarcellos.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "make:entity", description = "Criar nova classe do tipo Entity")
public class MakeEntityCommand implements Runnable {

    @Option(names = { "-n", "--name" }, description = "Nome do arquivo", required = true)
    String name;

    @Override
    public void run() {
        System.out.println(String.format("Gerar arquivo %s", name));
    }
}