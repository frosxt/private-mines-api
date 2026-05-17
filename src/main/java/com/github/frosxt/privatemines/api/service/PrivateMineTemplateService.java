package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.MineTemplateKey;
import com.github.frosxt.privatemines.api.view.PrivateMineTemplateView;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface PrivateMineTemplateService {

    Collection<PrivateMineTemplateView> allTemplates();

    Optional<PrivateMineTemplateView> findTemplate(MineTemplateKey key);

    boolean isUnlocked(UUID playerId, MineTemplateKey key);
}
