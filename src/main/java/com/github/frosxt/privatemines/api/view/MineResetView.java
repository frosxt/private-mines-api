package com.github.frosxt.privatemines.api.view;

import java.time.Duration;

public record MineResetView(boolean resetting, Duration timeUntilNextReset, double percentRemaining) {
}
