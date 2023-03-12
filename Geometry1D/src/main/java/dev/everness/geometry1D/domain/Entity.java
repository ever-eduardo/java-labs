package dev.everness.geometry1D.domain;

public abstract class Entity {
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();
}
