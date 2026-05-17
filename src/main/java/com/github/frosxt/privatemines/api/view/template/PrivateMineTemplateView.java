package com.github.frosxt.privatemines.api.view.template;

import com.github.frosxt.privatemines.api.model.template.MineTemplateKey;
import com.github.frosxt.privatemines.api.view.composition.MineCompositionView;

public record PrivateMineTemplateView(
        MineTemplateKey key,
        String displayName,
        int sizeX,
        int sizeY,
        int sizeZ,
        MineCompositionView defaultComposition
) {
}
