package com.github.frosxt.privatemines.api.event.lifecycle;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;

import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

import java.util.UUID;

public final class PrivateMineViewerRemovedEvent extends PrivateMineEvent {

    private final UUID viewer;

    public PrivateMineViewerRemovedEvent(final MineId mineId, final MineOwner owner, final UUID viewer) {
        super(mineId, owner);
        this.viewer = viewer;
    }

    public UUID viewer() {
        return viewer;
    }
}
