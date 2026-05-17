package com.github.frosxt.privatemines.api.capability;

import com.github.frosxt.privatemines.api.model.upgrade.MineUpgradeType;

import java.util.UUID;

public interface PrivateMineUpgradePricing {

    long priceFor(UUID ownerId, MineUpgradeType type, int currentLevel);

    boolean canAfford(UUID ownerId, long amount);

    boolean charge(UUID ownerId, long amount);
}
