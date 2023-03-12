package dev.everness.geometry1D.application.usecases;

import dev.everness.geometry1D.domain.Entity;
import dev.everness.geometry1D.domain.Line;
import dev.everness.geometry1D.domain.Point;

import java.util.Set;

public interface ICRUDGeometry {
    Set<Entity> getAll();
    Point createPoint(double location);
    Line createLine(Point a, Point b);
    void deleteEntity(Entity entity);
}
