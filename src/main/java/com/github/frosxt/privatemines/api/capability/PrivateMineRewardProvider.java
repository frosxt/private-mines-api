package com.github.frosxt.privatemines.api.capability;

import java.util.UUID;

public interface PrivateMineRewardProvider {
    void grantLevelUpReward(UUID ownerId, int level);
}