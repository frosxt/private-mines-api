package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.extension.PrivateMineBlockBreakModifier;
import com.github.frosxt.privatemines.api.extension.PrivateMineBlockRewardProvider;
import com.github.frosxt.privatemines.api.extension.PrivateMineExtensionRegistration;

public interface PrivateMineExtensionRegistry {

    PrivateMineExtensionRegistration registerBreakModifier(PrivateMineBlockBreakModifier modifier);

    PrivateMineExtensionRegistration registerRewardProvider(PrivateMineBlockRewardProvider provider);
}