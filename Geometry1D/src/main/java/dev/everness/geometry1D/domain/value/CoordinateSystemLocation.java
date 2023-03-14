package dev.everness.geometry1D.domain.value;

import java.util.Objects;

public class CoordinateSystemLocation {
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
}
