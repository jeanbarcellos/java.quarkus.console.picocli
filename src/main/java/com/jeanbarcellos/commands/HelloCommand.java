package com.jeanbarcellos.commands;

import picocli.CommandLine.Command;

@Command(
    name = "hello",
    description = "Greet World!"
)
class HelloCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}