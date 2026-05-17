package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

import java.util.UUID;

public final class PrivateMineLeftEvent extends PrivateMineEvent {

    private final UUID visitorId;

    public PrivateMineLeftEvent(final MineId mineId, final MineOwner owner, final UUID visitorId) {
        super(mineId, owner);
        this.visitorId = visitorId;
    }

    public UUID visitorId() {
        return visitorId;
    }
}
