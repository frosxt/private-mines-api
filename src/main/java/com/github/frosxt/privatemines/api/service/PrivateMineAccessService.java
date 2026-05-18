package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.access.MineAccessType;

import java.util.UUID;

public interface PrivateMineAccessService {

    boolean canVisit(UUID ownerId, UUID viewerId);

    boolean canMine(UUID ownerId, UUID viewerId);

    boolean canTeleport(UUID ownerId, UUID viewerId);

    boolean canViewLiveState(UUID ownerId, UUID viewerId);

    boolean hasFlag(UUID ownerId, UUID viewerId, MineAccessType flag);

    void grant(UUID ownerId, UUID viewerId, MineAccessType flag);

    void revoke(UUID ownerId, UUID viewerId, MineAccessType flag);

    void whitelist(UUID ownerId, UUID viewerId);

    void unwhitelist(UUID ownerId, UUID viewerId);

    void setPublicVisits(UUID ownerId, boolean enabled);

    boolean isPublicVisits(UUID ownerId);

    boolean isBanned(UUID ownerId, UUID viewerId);
}