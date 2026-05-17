package com.github.frosxt.privatemines.api.view.access;

import com.github.frosxt.privatemines.api.model.access.MineAccessType;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record MineAccessView(
        boolean publicVisits,
        Set<UUID> whitelistedPlayers,
        Map<UUID, Set<MineAccessType>> grantedFlags
) {
}
