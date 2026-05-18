package com.github.frosxt.privatemines.api.event.progression;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

public final class PrivateMineLevelUpEvent extends PrivateMineEvent {
    private final int previousLevel;
    private final int newLevel;

    public PrivateMineLevelUpEvent(final MineId mineId, final MineOwner owner, final int previousLevel, final int newLevel) {
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