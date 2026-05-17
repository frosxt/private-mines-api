package com.github.frosxt.privatemines.api.event.access;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;

import com.github.frosxt.privatemines.api.model.access.MineAccessType;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;

import java.util.UUID;

public final class PrivateMineAccessChangedEvent extends PrivateMineEvent {

    public enum Change {
        GRANT,
        REVOKE,
        WHITELIST_ADD,
        WHITELIST_REMOVE,
        PUBLIC_ENABLED,
        PUBLIC_DISABLED
    }

    private final UUID target;
    private final MineAccessType flag;
    private final Change change;

    public PrivateMineAccessChangedEvent(final MineId mineId, final MineOwner owner,
                                          final UUID target, final MineAccessType flag,
                                          final Change change) {
        super(mineId, owner);
        this.target = target;
        this.flag = flag;
        this.change = change;
    }

    public UUID target() {
        return target;
    }

    public MineAccessType flag() {
        return flag;
    }

    public Change change() {
        return change;
    }
}
