package dev.everness.geometry1D.domain;

import java.util.UUID;

public abstract class Entity {
    private UUID id;

    public Entity() {
        this.id = UUIDGeneratorService.generate();
    }

    public UUID getId() {
        return id;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

    public abstract String toInspectString();
}
