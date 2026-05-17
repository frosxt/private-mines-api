package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.MineBlockBreakBatchOutcome;
import com.github.frosxt.privatemines.api.model.MineBlockBreakOutcome;
import com.github.frosxt.privatemines.api.model.MineBlockPosition;
import com.github.frosxt.privatemines.api.model.MineBreakResult;
import com.github.frosxt.privatemines.api.model.MineBreakSource;

import java.util.Collection;
import java.util.UUID;

public interface PrivateMineBlockMutationService {

    MineBreakResult validateBreak(UUID actorId, UUID ownerId, MineBlockPosition position, MineBreakSource source);

    MineBlockBreakOutcome breakBlock(UUID actorId, UUID ownerId, MineBlockPosition position, MineBreakSource source);

    MineBlockBreakBatchOutcome breakBlocks(UUID actorId, UUID ownerId, Collection<MineBlockPosition> positions,
                                           MineBreakSource source);
}
