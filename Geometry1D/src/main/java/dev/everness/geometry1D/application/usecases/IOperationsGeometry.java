package dev.everness.geometry1D.application.usecases;

import dev.everness.geometry1D.domain.entity.Entity;

public interface IOperationsGeometry {
    boolean intersect(Entity left, Entity right);
    boolean isPoint(Entity entity);
    boolean isLine(Entity entity);
    boolean haveSameValue(Entity left, Entity right);
    boolean isSameEntity(Entity left, Entity right);
}
