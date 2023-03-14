package dev.everness.geometry1D.domain.value;

import dev.everness.geometry1D.domain.entity.Entity;

public interface Comparable {
    boolean lessThan(Entity entity);
    boolean lessEqual(Entity entity);
    boolean greaterThan(Entity entity);
    boolean greaterEqual(Entity entity);
}
