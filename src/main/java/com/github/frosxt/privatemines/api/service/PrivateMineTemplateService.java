package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.template.MineTemplateKey;
import com.github.frosxt.privatemines.api.view.template.PrivateMineTemplateView;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface PrivateMineTemplateService {

    Collection<PrivateMineTemplateView> allTemplates();

    Optional<PrivateMineTemplateView> findTemplate(MineTemplateKey key);

    boolean isUnlocked(UUID playerId, MineTemplateKey key);
}
