package com.github.frosxt.privatemines.api.capability;

import java.util.UUID;

public interface PrivateMineEconomyBridge {

    boolean canAfford(UUID playerId, long amount);

    boolean withdraw(UUID playerId, long amount);

    void deposit(UUID playerId, long amount);
}