package com.github.frosxt.privatemines.api.view;

import com.github.frosxt.privatemines.api.model.MineAccessType;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record MineAccessView(
        boolean publicVisits,
        Set<UUID> whitelistedPlayers,
        Map<UUID, Set<MineAccessType>> grantedFlags
) {
}
