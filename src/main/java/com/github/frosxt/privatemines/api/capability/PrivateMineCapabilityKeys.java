package com.github.frosxt.privatemines.api.capability;

import com.github.frosxt.prisoncore.api.capability.CapabilityKey;
import com.github.frosxt.privatemines.api.progression.PrivateMineProgressionProvider;
import com.github.frosxt.privatemines.api.service.PrivateMineBlockMutationService;
import com.github.frosxt.privatemines.api.service.PrivateMineAccessService;
import com.github.frosxt.privatemines.api.service.PrivateMineExtensionRegistry;
import com.github.frosxt.privatemines.api.service.PrivateMineQueryService;
import com.github.frosxt.privatemines.api.service.PrivateMineResetService;
import com.github.frosxt.privatemines.api.service.PrivateMineService;
import com.github.frosxt.privatemines.api.service.PrivateMineTemplateService;
import com.github.frosxt.privatemines.api.service.PrivateMineUpgradeService;
import com.github.frosxt.privatemines.api.service.PrivateMineViewService;

public final class PrivateMineCapabilityKeys {

    public static final String NAMESPACE = "private-mines";

    public static final CapabilityKey<PrivateMineService> MINE_SERVICE =
            CapabilityKey.of(NAMESPACE, "mine-service", PrivateMineService.class);

    public static final CapabilityKey<PrivateMineQueryService> QUERY_SERVICE =
            CapabilityKey.of(NAMESPACE, "query-service", PrivateMineQueryService.class);

    public static final CapabilityKey<PrivateMineAccessService> ACCESS_SERVICE =
            CapabilityKey.of(NAMESPACE, "access-service", PrivateMineAccessService.class);

    public static final CapabilityKey<PrivateMineResetService> RESET_SERVICE =
            CapabilityKey.of(NAMESPACE, "reset-service", PrivateMineResetService.class);

    public static final CapabilityKey<PrivateMineTemplateService> TEMPLATE_SERVICE =
            CapabilityKey.of(NAMESPACE, "template-service", PrivateMineTemplateService.class);

    public static final CapabilityKey<PrivateMineUpgradeService> UPGRADE_SERVICE =
            CapabilityKey.of(NAMESPACE, "upgrade-service", PrivateMineUpgradeService.class);

    public static final CapabilityKey<PrivateMineViewService> VIEW_SERVICE =
            CapabilityKey.of(NAMESPACE, "view-service", PrivateMineViewService.class);

    public static final CapabilityKey<PrivateMineBlockMutationService> BLOCK_MUTATION_SERVICE =
            CapabilityKey.of(NAMESPACE, "block-mutation-service", PrivateMineBlockMutationService.class);

    public static final CapabilityKey<PrivateMineExtensionRegistry> EXTENSION_REGISTRY =
            CapabilityKey.of(NAMESPACE, "extension-registry", PrivateMineExtensionRegistry.class);

    public static final CapabilityKey<PrivateMineProgressionProvider> PROGRESSION_PROVIDER =
            CapabilityKey.of(NAMESPACE, "progression-provider", PrivateMineProgressionProvider.class);

    public static final CapabilityKey<PrivateMineRewardProvider> REWARD_PROVIDER =
            CapabilityKey.of(NAMESPACE, "reward-provider", PrivateMineRewardProvider.class);

    public static final CapabilityKey<PrivateMineUpgradePricing> UPGRADE_PRICING =
            CapabilityKey.of(NAMESPACE, "upgrade-pricing", PrivateMineUpgradePricing.class);

    public static final CapabilityKey<PrivateMineBlockDropInterceptor> BLOCK_DROP_INTERCEPTOR =
            CapabilityKey.of(NAMESPACE, "block-drop-interceptor", PrivateMineBlockDropInterceptor.class);

    public static final CapabilityKey<PrivateMineEconomyBridge> ECONOMY_BRIDGE =
            CapabilityKey.of(NAMESPACE, "economy-bridge", PrivateMineEconomyBridge.class);

    private PrivateMineCapabilityKeys() {
    }
}
