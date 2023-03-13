package dev.everness.geometry1D.domain;

import java.util.Objects;

public class Point extends Entity {
    private double location;

    public Point(double location) {
        this.location = location;
    }

    public Point() {
        this.location = 0;
    }

    public double getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return Double.compare(point.location, location) == 0 && getId().equals(point.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, getId());
    }

    @Override
    public String toString() {
        return "Point{" +
                "location=" + location +
                ", id='" + getId() + '\'' +
                '}';
    }
}
