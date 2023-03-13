package dev.everness.geometry1D.application.usecases;

import dev.everness.geometry1D.domain.Entity;
import dev.everness.geometry1D.domain.Line;
import dev.everness.geometry1D.domain.Point;

public interface IOperationsGeometry {
    boolean intersect(Entity left, Entity right);
    static boolean isPoint(Entity entity) {
        return entity instanceof Point;
    }
    static boolean isLine(Entity entity) {
        return entity instanceof Line;
    }
    boolean isEqual(Entity left, Entity right);
}
