package dev.everness.geometry1D.framework.outputadapter;

import dev.everness.geometry1D.application.outputport.IGeometryRepository;
import dev.everness.geometry1D.domain.Entity;

import java.util.HashSet;
import java.util.Set;

public class InMemoryDB implements IGeometryRepository {
    private Set<Entity> entities;

    public InMemoryDB() {
        this.entities = new HashSet<>();
    }

    @Override
    public Set<Entity> getAll() {
        return this.entities;
    }
    @Override
    public void delete(Entity entity) {
        this.entities.remove(entity);
    }
}
