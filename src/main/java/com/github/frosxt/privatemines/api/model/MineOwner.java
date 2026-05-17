package com.github.frosxt.privatemines.api.model;

import java.util.Objects;
import java.util.UUID;

public record MineOwner(UUID playerId) {

    public MineOwner {
        Objects.requireNonNull(playerId, "playerId");
    }

    public static MineOwner of(final UUID playerId) {
        return new MineOwner(playerId);
    }
}
