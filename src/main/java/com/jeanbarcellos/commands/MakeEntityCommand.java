package com.jeanbarcellos.commands;

import javax.inject.Inject;

import com.jeanbarcellos.services.MakerService;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "make:entity", description = "Criar nova classe do tipo Entity")
public class MakeEntityCommand implements Runnable {

    @Inject
    private MakerService makerService;

    @Option(names = { "-n", "--name" }, description = "Nome do arquivo", required = true)
    private String name;

    @Option(names = { "-f", "--force" }, description = "Forçar a criação da classe mesmo se já existir")
    private boolean force = false;

    @Override
    public void run() {
        this.makerService.makeEntity(name, force);
    }

}