package dev.everness.geometry1D.application.inputport;

import dev.everness.geometry1D.application.outputport.IGeometryRepository;
import dev.everness.geometry1D.application.usecases.IService;
import dev.everness.geometry1D.domain.entity.Entity;
import dev.everness.geometry1D.domain.entity.Line;
import dev.everness.geometry1D.domain.entity.Point;

import java.util.Set;

public class GeometryService implements IService {
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
        if (left instanceof Point leftPoint && right instanceof Point rightPoint) {
            return leftPoint.getLocation() == rightPoint.getLocation();
        }
        if (left instanceof Point point && right instanceof Line line) {
            return this.checkPointInLine(point, line);
        }
        if (left instanceof Line line && right instanceof Point point) {
            return this.checkPointInLine(point, line);
        }
        if (left instanceof Line leftLine && right instanceof Line rightLine) {
            if (leftLine.getPointLeft().getLocation() <= rightLine.getPointLeft().getLocation()) {
                return this.checkLineIntersection(leftLine, rightLine);
            }
            return this.checkLineIntersection(rightLine, leftLine);
        }
        return false;
    }

    private boolean checkPointInLine(Point point, Line line) {
        return line.checkInvariant()
                && line.getPointLeft().getLocation() <= point.getLocation()
                && point.getLocation() <= line.getPointRight().getLocation();
    }

    private boolean checkLineIntersection(Line left, Line right) {
        return right.getPointLeft().getLocation() <= left.getPointRight().getLocation();
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
    public boolean haveSameValue(Entity left, Entity right) {
        return left.equals(right);
    }
}
