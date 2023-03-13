package dev.everness.geometry1D.application.usecases;

import dev.everness.geometry1D.domain.Entity;
import dev.everness.geometry1D.domain.Line;
import dev.everness.geometry1D.domain.Point;

public interface IOperationsGeometry {
    boolean intersect(Entity left, Entity right);
    boolean isPoint(Entity entity);
    boolean isLine(Entity entity);
    boolean isEqual(Entity left, Entity right);
}
