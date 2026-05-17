package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.view.mine.PrivateMineView;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface PrivateMineQueryService {

    Optional<PrivateMineView> view(UUID ownerId);

    Collection<PrivateMineView> loadedMines();

    int totalMines();
}
