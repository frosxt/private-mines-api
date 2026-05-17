package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.upgrade.MineUpgradeType;

import java.util.UUID;

public interface PrivateMineUpgradeService {

    int currentLevel(UUID ownerId, MineUpgradeType type);

    boolean canUpgrade(UUID ownerId, MineUpgradeType type);

    void applyUpgrade(UUID ownerId, MineUpgradeType type, int level);
}
