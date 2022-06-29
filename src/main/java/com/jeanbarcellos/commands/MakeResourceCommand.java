package com.jeanbarcellos.commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "make:resource", description = "Criar nova classe do tipo Resource")
public class MakeResourceCommand implements Runnable {

    @Option(names = { "-n", "--name" }, description = "Nome do arquivo", required = true)
    String name;

    @Override
    public void run() {
        System.out.println(String.format("Gerar arquivo %sResource", name));
    }
}