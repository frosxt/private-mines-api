package com.github.frosxt.privatemines.api.view;

public record MineMonetisationView(
        double taxRate,
        long entryFee,
        long vaultUnclaimed,
        long vaultLifetimeGenerated,
        long vaultLifetimeClaimed
) {
}
