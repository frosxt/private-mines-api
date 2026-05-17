package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

public final class PrivateMineDeletedEvent extends PrivateMineEvent {

    public PrivateMineDeletedEvent(final MineId mineId, final MineOwner owner) {
        super(mineId, owner);
    }
}
