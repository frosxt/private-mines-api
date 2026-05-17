package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.MineResetCause;

import java.util.UUID;

public interface PrivateMineResetService {

    void reset(UUID ownerId, MineResetCause cause);

    boolean isResetting(UUID ownerId);

    double percentRemaining(UUID ownerId);
}
