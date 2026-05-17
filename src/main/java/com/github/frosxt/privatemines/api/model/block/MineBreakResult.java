package com.github.frosxt.privatemines.api.model.block;

public enum MineBreakResult {
    ACCEPTED,
    DENIED_NOT_OWNER,
    DENIED_NO_PERMISSION,
    DENIED_OUT_OF_REGION,
    DENIED_RESETTING,
    DENIED_CANCELLED,
    DENIED_ALREADY_BROKEN,
    DENIED_INVALID_BLOCK
}
