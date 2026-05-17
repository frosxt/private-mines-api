package com.github.frosxt.privatemines.api.capability;

import java.util.UUID;

public interface PrivateMineBlockDropInterceptor {

    boolean interceptDrop(UUID breakerId, UUID ownerId, String materialName, int localX, int localY, int localZ);
}
