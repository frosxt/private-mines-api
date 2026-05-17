package com.github.frosxt.privatemines.api.event;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class PrivateMineEventBus {

    private final ConcurrentHashMap<Class<? extends PrivateMineEvent>, CopyOnWriteArrayList<Consumer<?>>> subscribers =
            new ConcurrentHashMap<>();
    private final Logger logger;

    public PrivateMineEventBus(final Logger logger) {
        this.logger = logger;
    }

    public <E extends PrivateMineEvent> void subscribe(final Class<E> type, final Consumer<E> listener) {
        subscribers.computeIfAbsent(type, k -> new CopyOnWriteArrayList<>()).add(listener);
    }

    @SuppressWarnings("unchecked")
    public <E extends PrivateMineEvent> void publish(final E event) {
        final CopyOnWriteArrayList<Consumer<?>> list = subscribers.get(event.getClass());
        if (list == null) {
            return;
        }
        for (final Consumer<?> raw : list) {
            try {
                ((Consumer<E>) raw).accept(event);
            } catch (final Exception ex) {
                logger.log(Level.WARNING, "[PrivateMines] Event listener threw for "
                        + event.getClass().getSimpleName(), ex);
            }
        }
    }

    public void clear() {
        subscribers.clear();
    }
}
