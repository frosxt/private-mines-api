package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

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
