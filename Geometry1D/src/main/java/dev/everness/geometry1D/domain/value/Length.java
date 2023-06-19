package dev.everness.geometry1D.domain.value;

public class Length extends Value {
    private double length;
    @Override
    public boolean lessThan(Value value) {
        return false;
    }

    @Override
    public boolean lessEqual(Value value) {
        return false;
    }

    @Override
    public boolean greaterThan(Value value) {
        return false;
    }

    @Override
    public boolean greaterEqual(Value value) {
        return false;
    }
}
