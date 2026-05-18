package com.github.frosxt.privatemines.api.service;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface PrivateMineViewService {

    void addViewer(UUID ownerId, UUID viewerId);

    void removeViewer(UUID ownerId, UUID viewerId);

    Set<UUID> viewers(UUID ownerId);

    Optional<UUID> ownerOf(UUID viewerId);
}