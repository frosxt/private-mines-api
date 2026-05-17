package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

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
