package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.MineTemplateKey;
import com.github.frosxt.privatemines.api.view.PrivateMineView;

import java.util.Optional;
import java.util.UUID;

public interface PrivateMineService {

    Optional<PrivateMineView> findByOwner(UUID ownerId);

    PrivateMineView createMine(UUID ownerId, MineTemplateKey template);

    void deleteMine(UUID ownerId);

    boolean isLoaded(UUID ownerId);

    void loadMine(UUID ownerId);

    void unloadMine(UUID ownerId);
}
