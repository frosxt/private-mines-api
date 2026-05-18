package com.github.frosxt.privatemines.api.model.identity;

import java.util.Objects;
import java.util.UUID;

public record MineId(UUID value) {

    public MineId {
        Objects.requireNonNull(value, "value");
    }

    public static MineId fresh() {
        return new MineId(UUID.randomUUID());
    }

    public static MineId of(final UUID value) {
        return new MineId(value);
    }

    public static MineId fromString(final String raw) {
        return new MineId(UUID.fromString(raw));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}