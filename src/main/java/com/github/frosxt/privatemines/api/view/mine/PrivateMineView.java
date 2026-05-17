package com.github.frosxt.privatemines.api.view.mine;

import com.github.frosxt.privatemines.api.model.identity.MineId;
import com.github.frosxt.privatemines.api.model.identity.MineOwner;
import com.github.frosxt.privatemines.api.model.region.MineRegionView;
import com.github.frosxt.privatemines.api.model.template.MineTemplateKey;
import com.github.frosxt.privatemines.api.view.access.MineAccessView;
import com.github.frosxt.privatemines.api.view.composition.MineCompositionView;
import com.github.frosxt.privatemines.api.view.monster.MineBlockMonsterView;
import com.github.frosxt.privatemines.api.view.monetisation.MineMonetisationView;
import com.github.frosxt.privatemines.api.view.progression.MineProgressionView;
import com.github.frosxt.privatemines.api.view.reset.MineResetView;

public record PrivateMineView(
        MineId id,
        MineOwner owner,
        MineTemplateKey template,
        MineAccessView access,
        MineStatsView stats,
        MineCompositionView composition,
        MineProgressionView progression,
        MineMonetisationView monetisation,
        MineResetView reset,
        MineBlockMonsterView blockMonster,
        MineRegionView mineRegion,
        MineRegionView packetRegion,
        MineRegionView activeRegion,
        double percentRemaining,
        boolean loaded,
        int viewerCount
) {
}
