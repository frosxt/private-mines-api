package com.github.frosxt.privatemines.api.model.block;

import com.github.frosxt.privatemines.api.model.identity.MineId;

import java.util.UUID;

public record MineBlockBreakOutcome(
        UUID actorId,
        UUID ownerId,
        MineId mineId,
        MineBreakSource source,
        MineBlockPosition position,
        String materialName,
        MineBreakResult result,
        boolean changed,
        boolean packetsSent
) {
}