package com.github.frosxt.privatemines.api.model.block;

import java.util.List;

public record MineBlockBreakBatchOutcome(List<MineBlockBreakOutcome> results) {

    public MineBlockBreakBatchOutcome {
        results = List.copyOf(results);
    }

    public long acceptedCount() {
        return results.stream()
                .filter(MineBlockBreakOutcome::changed)
                .count();
    }
}