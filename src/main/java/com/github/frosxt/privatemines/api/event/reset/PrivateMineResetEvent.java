package com.github.frosxt.privatemines.api.event.reset;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;
import com.github.frosxt.privatemines.api.model.reset.MineResetCause;

public final class PrivateMineResetEvent extends PrivateMineEvent {
    private final MineResetCause cause;
    private final int blocksRepopulated;

    public PrivateMineResetEvent(final MineId mineId, final MineOwner owner, final MineResetCause cause, final int blocksRepopulated) {
        super(mineId, owner);
        this.cause = cause;
        this.blocksRepopulated = blocksRepopulated;
    }

    public MineResetCause cause() {
        return cause;
    }

    public int blocksRepopulated() {
        return blocksRepopulated;
    }
}