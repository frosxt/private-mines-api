package com.github.frosxt.privatemines.api.event.upgrade;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;

import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;
import com.github.frosxt.privatemines.api.model.upgrade.MineUpgradeType;

public final class PrivateMineUpgradeAppliedEvent extends PrivateMineEvent {

    private final MineUpgradeType type;
    private final int oldLevel;
    private final int newLevel;

    public PrivateMineUpgradeAppliedEvent(final MineId mineId, final MineOwner owner,
                                           final MineUpgradeType type,
                                           final int oldLevel, final int newLevel) {
        super(mineId, owner);
        this.type = type;
        this.oldLevel = oldLevel;
        this.newLevel = newLevel;
    }

    public MineUpgradeType type() {
        return type;
    }

    public int oldLevel() {
        return oldLevel;
    }

    public int newLevel() {
        return newLevel;
    }
}
