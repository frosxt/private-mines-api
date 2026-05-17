package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;
import com.github.frosxt.privatemines.api.model.MineResetCause;

public final class PrivateMineResetEvent extends PrivateMineEvent {

    private final MineResetCause cause;
    private final int blocksRepopulated;

    public PrivateMineResetEvent(final MineId mineId, final MineOwner owner,
                                  final MineResetCause cause, final int blocksRepopulated) {
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
