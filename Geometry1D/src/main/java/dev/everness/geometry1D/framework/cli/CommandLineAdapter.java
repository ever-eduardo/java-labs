package dev.everness.geometry1D.framework.cli;

import java.io.Console;

public class CommandLineAdapter {
    private Console console;
    private boolean running;
    private static final String WELCOME = """
            Welcome to Geometry 1D
            """;
    private static final String PROMPT = " geometry > ";

    public CommandLineAdapter() throws RuntimeException {
        console = System.console();
        if (console == null) throw new RuntimeException("No Console found in your system");
        this.running = true;
    }

    public void run() {
        System.out.print(CommandLineAdapter.WELCOME);
        while (running) {
            System.out.print(CommandLineAdapter.PROMPT);
            final String input = console.readLine();
            System.out.println(input);
        }
    }
}
