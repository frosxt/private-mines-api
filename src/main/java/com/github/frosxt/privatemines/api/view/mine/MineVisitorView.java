package com.github.frosxt.privatemines.api.view.mine;

import com.github.frosxt.privatemines.api.model.access.MineAccessType;

import java.util.Set;
import java.util.UUID;

public record MineVisitorView(UUID playerId, Set<MineAccessType> grantedFlags, boolean currentlyPresent) {
}