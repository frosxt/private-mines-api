package com.github.frosxt.privatemines.api.extension;

import com.github.frosxt.privatemines.api.model.MineBlockBreakOutcome;

public interface PrivateMineBlockRewardProvider {

    void handleBreak(MineBlockBreakOutcome outcome);
}
