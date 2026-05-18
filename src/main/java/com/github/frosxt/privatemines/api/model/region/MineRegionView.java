package com.github.frosxt.privatemines.api.model.region;

public record MineRegionView(int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {

    public boolean contains(final int x, final int y, final int z) {
        return x >= minX && x <= maxX && y >= minY && y <= maxY && z >= minZ && z <= maxZ;
    }
}