package dev.everness.geometry1D.domain.entity;

import dev.everness.geometry1D.domain.value.CoordinateSystemLocation;

import java.util.Objects;

public class Point extends Entity {
    private CoordinateSystemLocation location;

    public Point(CoordinateSystemLocation location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return location.equals(point.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, getId());
    }

    @Override
    public String toString() {
        return "Point(" +
                location +
                ')';
    }

    @Override
    public String inspect() {
        return "Point(" +
                "id='" + getId() + '\'' +
                ", location=" + location +
                ')';
    }

    @Override
    public boolean isSelf(Entity other) {
        return getId().equals(other.getId());
    }

    public boolean lessThan(Point other) {
        return location.lessThan(other.location);
    }

    public boolean lessEqual(Point other) {
        return location.lessEqual(other.location);
    }

    public boolean greaterThan(Point other) {
        return location.greaterThan(other.location);
    }

    public boolean greaterEqual(Point other) {
        return location.greaterEqual(other.location);
    }
}
