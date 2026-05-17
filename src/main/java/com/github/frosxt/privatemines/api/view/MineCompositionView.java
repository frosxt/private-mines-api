package com.github.frosxt.privatemines.api.view;

import java.util.List;

public record MineCompositionView(List<Entry> entries, long totalWeight) {

    public record Entry(String materialName, int weight) {
    }
}
