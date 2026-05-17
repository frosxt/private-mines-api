package com.github.frosxt.privatemines.api.extension;

import com.github.frosxt.privatemines.api.event.block.PrivateMineBlockBreakPostEvent;
import com.github.frosxt.privatemines.api.event.block.PrivateMineBlockBreakPreEvent;

public interface PrivateMineBlockBreakModifier {

    default void beforeBreak(final PrivateMineBlockBreakPreEvent event) {
    }

    default void afterBreak(final PrivateMineBlockBreakPostEvent event) {
    }
}
