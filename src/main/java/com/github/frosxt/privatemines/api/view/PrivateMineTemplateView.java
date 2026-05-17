package com.github.frosxt.privatemines.api.view;

import com.github.frosxt.privatemines.api.model.MineTemplateKey;

public record PrivateMineTemplateView(
        MineTemplateKey key,
        String displayName,
        int sizeX,
        int sizeY,
        int sizeZ,
        MineCompositionView defaultComposition
) {
}
