package com.github.frosxt.privatemines.api.event;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;
import com.github.frosxt.privatemines.api.model.MineTemplateKey;

public final class PrivateMineCreatedEvent extends PrivateMineEvent {

    private final MineTemplateKey template;

    public PrivateMineCreatedEvent(final MineId mineId, final MineOwner owner, final MineTemplateKey template) {
        super(mineId, owner);
        this.template = template;
    }

    public MineTemplateKey template() {
        return template;
    }
}
