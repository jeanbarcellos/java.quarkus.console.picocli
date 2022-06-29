package com.jeanbarcellos.commands;

import picocli.CommandLine.Command;

@Command(
    name = "goodbye",
    description = "Say goodbye to World!"
)
class GoodByeCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("Goodbye World!");
    }
}