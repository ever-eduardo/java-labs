package dev.everness.geometry1D.domain;

public class Point extends Entity {
    private double location;

    public Point(double location) {
        this.location = location;
    }

    public Point() {
        this.location = 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
