package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

import java.time.Instant;

public abstract class PrivateMineEvent {

    private final MineId mineId;
    private final MineOwner owner;
    private final Instant timestamp;

    protected PrivateMineEvent(final MineId mineId, final MineOwner owner) {
        this.mineId = mineId;
        this.owner = owner;
        this.timestamp = Instant.now();
    }

    public MineId mineId() {
        return mineId;
    }

    public MineOwner owner() {
        return owner;
    }

    public Instant timestamp() {
        return timestamp;
    }
}
