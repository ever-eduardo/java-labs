package dev.everness.geometry1D.domain.value;

import dev.everness.geometry1D.domain.entity.Entity;

import java.util.Objects;

public class CoordinateSystemLocation extends Value {
    private double location;

    private CoordinateSystemLocation(double location) {
        this.location = location;
    }

    public static CoordinateSystemLocation createLocation(double location) {
        if (Double.isInfinite(location))
            throw new RuntimeException("CoordinateSystemLocation cannot be infinite");
        if (Double.isNaN(location))
            throw new RuntimeException("CoordinateSystemLocation cannot be NaN");
        return new CoordinateSystemLocation(location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoordinateSystemLocation that)) return false;
        return Double.compare(that.location, location) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return "Location(" + location + ')';
    }

    @Override
    public boolean lessThan(Value value) {
        if (value instanceof CoordinateSystemLocation coord)
            return Double.compare(location, coord.location) < 0;
        return false;
    }

    @Override
    public boolean lessEqual(Value value) {
        if (value instanceof CoordinateSystemLocation coord)
            return Double.compare(location, coord.location) <= 0;
        return false;
    }

    @Override
    public boolean greaterThan(Value value) {
        if (value instanceof CoordinateSystemLocation coord)
            return Double.compare(location, coord.location) > 0;
        return false;
    }

    @Override
    public boolean greaterEqual(Value value) {
        if (value instanceof CoordinateSystemLocation coord)
            return Double.compare(location, coord.location) >= 0;
        return false;
    }
}
