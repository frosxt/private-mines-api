package com.github.frosxt.privatemines.api.view;

import com.github.frosxt.privatemines.api.model.MineAccessType;

import java.util.Set;
import java.util.UUID;

public record MineVisitorView(
        UUID playerId,
        Set<MineAccessType> grantedFlags,
        boolean currentlyPresent
) {
}
