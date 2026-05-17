package com.github.frosxt.privatemines.api.view;

import com.github.frosxt.privatemines.api.model.MineId;
import com.github.frosxt.privatemines.api.model.MineOwner;
import com.github.frosxt.privatemines.api.model.MineRegionView;
import com.github.frosxt.privatemines.api.model.MineTemplateKey;

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
