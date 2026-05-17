package com.github.frosxt.privatemines.api.extension;

import com.github.frosxt.privatemines.api.event.PrivateMineBlockBreakPostEvent;
import com.github.frosxt.privatemines.api.event.PrivateMineBlockBreakPreEvent;

public interface PrivateMineBlockBreakModifier {

    default void beforeBreak(final PrivateMineBlockBreakPreEvent event) {
    }

    default void afterBreak(final PrivateMineBlockBreakPostEvent event) {
    }
}
