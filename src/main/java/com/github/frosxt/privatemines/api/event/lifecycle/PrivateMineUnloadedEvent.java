package com.github.frosxt.privatemines.api.event.lifecycle;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;

import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

public final class PrivateMineUnloadedEvent extends PrivateMineEvent {

    public PrivateMineUnloadedEvent(final MineId mineId, final MineOwner owner) {
        super(mineId, owner);
    }
}
