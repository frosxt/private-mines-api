package com.github.frosxt.privatemines.api.event.lifecycle;

import com.github.frosxt.privatemines.api.event.base.PrivateMineEvent;
import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;
import com.github.frosxt.privatemines.api.model.template.MineTemplateKey;

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