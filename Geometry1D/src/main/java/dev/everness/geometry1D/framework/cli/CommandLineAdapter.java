package dev.everness.geometry1D.framework.cli;
import dev.everness.geometry1D.application.usecases.IService;

import java.io.Console;

public class CommandLineAdapter {
    private Console console;
    private boolean running;

    private IService service;

    public CommandLineAdapter(IService service) throws RuntimeException {
        console = System.console();
        if (console == null) throw new RuntimeException("No Console found in your system");
        this.running = true;
        this.service = service;
    }

    public void run() {
        System.out.print(Command.WELCOME);
        while (running) {
            System.out.print(Command.PROMPT);
            final String input = console.readLine();
            switch (input) {
                case Command.EXIT -> running = false;
                default -> System.out.println(input);
            }
        }
    }
}
