package dev.everness.geometry1D.application.inputport;

import dev.everness.geometry1D.application.outputport.IGeometryRepository;
import dev.everness.geometry1D.application.usecases.ICRUDGeometry;
import dev.everness.geometry1D.application.usecases.IOperationsGeometry;
import dev.everness.geometry1D.domain.Entity;
import dev.everness.geometry1D.domain.Line;
import dev.everness.geometry1D.domain.Point;

import java.util.Set;

public class GeometryService implements ICRUDGeometry, IOperationsGeometry {
    private IGeometryRepository repository;

    public GeometryService(IGeometryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Entity> getAll() {
        return repository.getAll();
    }

    @Override
    public Point createPoint(double location) {
        return new Point(location);
    }

    @Override
    public Line createLine(Point a, Point b) {
        return new Line(a, b);
    }

    @Override
    public void deleteEntity(Entity entity) {
        repository.delete(entity);
    }

    @Override
    public boolean intersect(Entity left, Entity right) {
        return false;
    }

    @Override
    public boolean isPoint(Entity entity) {
        return entity instanceof Point;
    }

    @Override
    public boolean isLine(Entity entity) {
        return entity instanceof Line;
    }

    @Override
    public boolean isEqual(Entity left, Entity right) {
        return left.equals(right);
    }
}
