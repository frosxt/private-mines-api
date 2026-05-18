package com.github.frosxt.privatemines.api.view.reset;

import java.time.Duration;

public record MineResetView(boolean resetting, Duration timeUntilNextReset, double percentRemaining) {
}