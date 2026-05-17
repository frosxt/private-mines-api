package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineBreakResult;
import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

import java.util.UUID;

public final class PrivateMineBlockBreakEvent extends PrivateMineEvent {

    private final UUID breaker;
    private final int localX;
    private final int localY;
    private final int localZ;
    private final String materialName;
    private final MineBreakResult result;

    public PrivateMineBlockBreakEvent(final MineId mineId, final MineOwner owner,
                                       final UUID breaker,
                                       final int localX, final int localY, final int localZ,
                                       final String materialName,
                                       final MineBreakResult result) {
        super(mineId, owner);
        this.breaker = breaker;
        this.localX = localX;
        this.localY = localY;
        this.localZ = localZ;
        this.materialName = materialName;
        this.result = result;
    }

    public UUID breaker() {
        return breaker;
    }

    public int localX() {
        return localX;
    }

    public int localY() {
        return localY;
    }

    public int localZ() {
        return localZ;
    }

    public String materialName() {
        return materialName;
    }

    public MineBreakResult result() {
        return result;
    }
}
