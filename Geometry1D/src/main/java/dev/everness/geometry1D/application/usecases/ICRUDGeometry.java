package dev.everness.geometry1D.application.usecases;

import dev.everness.geometry1D.domain.entity.Entity;
import dev.everness.geometry1D.domain.entity.Line;
import dev.everness.geometry1D.domain.entity.Point;

import java.util.Set;

public interface ICRUDGeometry {
    Set<Entity> getAll();
    Point createPoint(double location);
    Line createLine(Point a, Point b);
    void deleteEntity(Entity entity);
}
