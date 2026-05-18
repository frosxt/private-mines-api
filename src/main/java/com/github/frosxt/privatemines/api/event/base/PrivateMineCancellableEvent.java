package com.github.frosxt.privatemines.api.event.base;

import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

public abstract class PrivateMineCancellableEvent extends PrivateMineEvent {

    private boolean cancelled;

    protected PrivateMineCancellableEvent(final MineId mineId, final MineOwner owner) {
        super(mineId, owner);
    }

    public boolean cancelled() {
        return cancelled;
    }

    public void cancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
}