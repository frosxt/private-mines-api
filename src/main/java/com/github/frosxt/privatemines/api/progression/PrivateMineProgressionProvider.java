package com.github.frosxt.privatemines.api.progression;

import java.util.UUID;

public interface PrivateMineProgressionProvider {

    int rankOf(UUID playerId);

    int prestigeOf(UUID playerId);
}
