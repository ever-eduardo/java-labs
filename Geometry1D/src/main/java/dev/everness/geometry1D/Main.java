package dev.everness.geometry1D;

import dev.everness.geometry1D.application.inputport.GeometryService;
import dev.everness.geometry1D.application.outputport.IGeometryRepository;
import dev.everness.geometry1D.application.usecases.IService;
import dev.everness.geometry1D.framework.cli.CommandLineAdapter;
import dev.everness.geometry1D.framework.outputadapter.InMemoryDB;

public class Main {
    public static void main(String[] args) {
        IGeometryRepository repository = new InMemoryDB();
        IService service = new GeometryService(repository);
        CommandLineAdapter cli = new CommandLineAdapter(service);
        cli.run();
    }
}
