package com.github.frosxt.privatemines.api.event.block;

import com.github.frosxt.privatemines.api.event.base.PrivateMineCancellableEvent;
import com.github.frosxt.privatemines.api.model.block.MineBlockPosition;
import com.github.frosxt.privatemines.api.model.block.MineBreakSource;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

import java.util.UUID;

public final class PrivateMineBlockBreakPreEvent extends PrivateMineCancellableEvent {
    private final UUID actorId;
    private final MineBreakSource source;
    private final MineBlockPosition position;
    private final String materialName;
    private boolean cancelUpdate;

    public PrivateMineBlockBreakPreEvent(final MineId mineId,
                                         final MineOwner owner,
                                         final UUID actorId,
                                         final MineBreakSource source,
                                         final MineBlockPosition position,
                                         final String materialName) {
        super(mineId, owner);
        this.actorId = actorId;
        this.source = source;
        this.position = position;
        this.materialName = materialName;
    }

    public UUID actorId() {
        return actorId;
    }

    public MineBreakSource source() {
        return source;
    }

    public MineBlockPosition position() {
        return position;
    }

    public String materialName() {
        return materialName;
    }

    public boolean cancelUpdate() {
        return cancelUpdate;
    }

    public void cancelUpdate(final boolean cancelUpdate) {
        this.cancelUpdate = cancelUpdate;
    }
}