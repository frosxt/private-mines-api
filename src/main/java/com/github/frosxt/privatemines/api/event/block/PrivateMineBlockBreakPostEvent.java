package com.github.frosxt.privatemines.api.event.block;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;

import com.github.frosxt.privatemines.api.model.block.MineBlockBreakOutcome;

public final class PrivateMineBlockBreakPostEvent extends PrivateMineEvent {

    private final MineBlockBreakOutcome outcome;

    public PrivateMineBlockBreakPostEvent(final MineBlockBreakOutcome outcome) {
        super(outcome.mineId(), new com.github.frosxt.privatemines.api.model.identity.MineOwner(outcome.ownerId()));
        this.outcome = outcome;
    }

    public MineBlockBreakOutcome outcome() {
        return outcome;
    }
}
