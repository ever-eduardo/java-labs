package dev.everness.geometry1D.domain.value;

import dev.everness.geometry1D.domain.entity.Entity;

public interface Comparable {
    boolean lessThan(Value value);
    boolean lessEqual(Value value);
    boolean greaterThan(Value value);
    boolean greaterEqual(Value value);
}
