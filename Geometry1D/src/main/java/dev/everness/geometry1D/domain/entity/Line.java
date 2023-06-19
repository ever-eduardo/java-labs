package dev.everness.geometry1D.domain.entity;

import java.util.Objects;

public class Line extends Entity {
    private Point pointLeft;
    private Point pointRight;

    private Line(Point pointLeft, Point pointRight) {
        this.pointLeft = pointLeft;
        this.pointRight = pointRight;
    }

    public static Line createLine(Point pointLeft, Point pointRight) {
        Point left, right;
        if (pointLeft.lessEqual(pointRight)) {
            left = pointLeft;
            right = pointRight;
        } else {
            left = pointRight;
            right = pointLeft;
        }
        Line line = new Line(left, right);
        line.checkInvariant();
        return line;
    }

    public boolean checkInvariant() {
        return pointLeft.lessEqual(pointRight);
    }

    public double length() {
        return Math.sqrt(Math.pow(pointLeft.getLocation(), 1) + Math.pow(pointRight.getLocation(), 2));
    }

    public Point getPointLeft() {
        return pointLeft;
    }

    public Point getPointRight() {
        return pointRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return  pointLeft.equals(line.pointLeft) && pointRight.equals(line.pointRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), pointLeft, pointRight);
    }

    @Override
    public String toString() {
        return String.format("Line(%s, %s)", pointLeft, pointRight);
    }

    @Override
    public String inspect() {
        return String.format("Line(id='%s', a=%s, b=%s)", getId(), pointLeft.inspect(), pointRight.inspect());
    }

    @Override
    public boolean isSelf(Entity other) {
        return getId().equals(other.getId());
    }
}
