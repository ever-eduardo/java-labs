package dev.everness.geometry1D.domain;

public abstract class Entity {
    private String id;

    public Entity() {
        this.id = UUIDGeneratorService.generate();
    }

    public String getId() {
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
