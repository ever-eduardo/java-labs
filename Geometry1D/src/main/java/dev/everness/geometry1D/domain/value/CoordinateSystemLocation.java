package dev.everness.geometry1D.domain.value;

public class CoordinateSystemLocation {
    private double location;

    private CoordinateSystemLocation(double location) {
        this.location = location;
    }

    public double getLocation() {
        return location;
    }

    public static CoordinateSystemLocation createLocation(double location) {
        if (Double.isInfinite(location))
            throw new RuntimeException("CoordinateSystemLocation cannot be infinite");
        if (Double.isNaN(location))
            throw new RuntimeException("CoordinateSystemLocation cannot be NaN");
        return new CoordinateSystemLocation(location);
    }
}
