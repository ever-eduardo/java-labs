package dev.everness.geometry1D.application.outputport;

import dev.everness.geometry1D.domain.entity.Entity;

import java.util.Set;

public interface IGeometryRepository {
    Set<Entity> getAll();
    void delete(Entity entity);
}
