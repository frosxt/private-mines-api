package com.github.frosxt.privatemines.api.event.lifecycle;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

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