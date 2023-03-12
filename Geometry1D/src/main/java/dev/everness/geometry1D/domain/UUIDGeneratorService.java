package dev.everness.geometry1D.domain;

import java.util.UUID;

public class UUIDGeneratorService {
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
