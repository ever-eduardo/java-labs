package dev.everness.geometry1D.domain;

import java.util.Objects;

public class Line extends Entity {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double length() {
        return Math.sqrt(Math.pow(a.getLocation(), 1) + Math.pow(b.getLocation(), 2));
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return getId().equals(line.getId()) && a.equals(line.a) && b.equals(line.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), a, b);
    }

    @Override
    public String toString() {
        return "Line{" +
                "id='" + getId() + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
