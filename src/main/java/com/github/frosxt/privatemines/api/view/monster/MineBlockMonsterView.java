package com.github.frosxt.privatemines.api.view.monster;

public record MineBlockMonsterView(boolean active, String status, long level, double health, double maxHealth, long cooldownUntilEpochMillis) {
}