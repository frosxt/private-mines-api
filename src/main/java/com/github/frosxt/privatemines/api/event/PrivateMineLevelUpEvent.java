package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;

public final class PrivateMineLevelUpEvent extends PrivateMineEvent {

    private final int previousLevel;
    private final int newLevel;

    public PrivateMineLevelUpEvent(final MineId mineId, final MineOwner owner,
                                     final int previousLevel, final int newLevel) {
        super(mineId, owner);
        this.previousLevel = previousLevel;
        this.newLevel = newLevel;
    }

    public int previousLevel() {
        return previousLevel;
    }

    public int newLevel() {
        return newLevel;
    }
}
