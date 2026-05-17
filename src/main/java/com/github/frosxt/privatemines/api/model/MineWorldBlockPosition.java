package com.github.frosxt.privatemines.api.model;

public record MineWorldBlockPosition(String worldName, int worldX, int worldY, int worldZ) {

    public MineWorldBlockPosition {
        if (worldName == null || worldName.isBlank()) {
            throw new IllegalArgumentException("worldName must not be blank");
        }
    }
}
