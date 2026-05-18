package com.github.frosxt.privatemines.api.service;

import com.github.frosxt.privatemines.api.model.block.MineBlockBreakBatchOutcome;
import com.github.frosxt.privatemines.api.model.block.MineBlockBreakOutcome;
import com.github.frosxt.privatemines.api.model.block.MineBlockPosition;
import com.github.frosxt.privatemines.api.model.block.MineBreakResult;
import com.github.frosxt.privatemines.api.model.block.MineBreakSource;

import java.util.Collection;
import java.util.UUID;

public interface PrivateMineBlockMutationService {

    MineBreakResult validateBreak(UUID actorId, UUID ownerId, MineBlockPosition position, MineBreakSource source);

    MineBlockBreakOutcome breakBlock(UUID actorId, UUID ownerId, MineBlockPosition position, MineBreakSource source);

    MineBlockBreakBatchOutcome breakBlocks(UUID actorId, UUID ownerId, Collection<MineBlockPosition> positions, MineBreakSource source);
}
