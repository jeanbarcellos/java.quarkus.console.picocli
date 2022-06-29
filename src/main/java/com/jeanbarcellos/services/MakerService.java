package com.jeanbarcellos.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MakerService {

    public void makeEntity(String name, boolean force) {
        printLn(String.format("Gerar arquivo %s", name));
        printLn(String.format("Sobreescrever arquivo? '%s'", force ? "sim" : "não"));
    }

    public void makeService(String name, boolean force, boolean crud) {
        printLn(String.format("Gerar arquivo %sService", name));
        printLn(String.format("Sobreescrever arquivo? '%s'", force ? "sim" : "não"));
        printLn(String.format("Crud? '%s'", crud));
    }

    public void makeResource(String name, boolean force, boolean crud) {
        printLn(String.format("Gerar arquivo %sResource", name));
        printLn(String.format("Sobreescrever arquivo? '%s'", force ? "sim" : "não"));
        printLn(String.format("Crud? '%s'", crud));
    }

    private static void printLn(String x) {
        System.out.println(x);
    }

}
