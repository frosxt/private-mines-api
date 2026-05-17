package com.github.frosxt.privatemines.api.view.mine;

import java.time.Instant;

public record MineStatsView(
        long totalBlocksBroken,
        long totalResets,
        Instant createdAt,
        Instant lastResetAt
) {
}
