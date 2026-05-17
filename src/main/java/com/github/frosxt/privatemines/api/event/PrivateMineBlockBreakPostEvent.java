package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineBlockBreakOutcome;

public final class PrivateMineBlockBreakPostEvent extends PrivateMineEvent {

    private final MineBlockBreakOutcome outcome;

    public PrivateMineBlockBreakPostEvent(final MineBlockBreakOutcome outcome) {
        super(outcome.mineId(), new com.github.frosxt.privatemines.api.model.MineOwner(outcome.ownerId()));
        this.outcome = outcome;
    }

    public MineBlockBreakOutcome outcome() {
        return outcome;
    }
}
