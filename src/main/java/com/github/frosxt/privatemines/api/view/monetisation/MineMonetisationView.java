package com.github.frosxt.privatemines.api.view.monetisation;

public record MineMonetisationView(
        double taxRate,
        long entryFee,
        long vaultUnclaimed,
        long vaultLifetimeGenerated,
        long vaultLifetimeClaimed
) {
}
