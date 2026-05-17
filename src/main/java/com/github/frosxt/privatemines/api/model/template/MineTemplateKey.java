package com.github.frosxt.privatemines.api.model.template;

import java.util.Objects;

public record MineTemplateKey(String value) {

    public MineTemplateKey {
        Objects.requireNonNull(value, "value");
        if (value.isBlank()) {
            throw new IllegalArgumentException("Template key cannot be blank");
        }
    }

    public static MineTemplateKey of(final String value) {
        return new MineTemplateKey(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
