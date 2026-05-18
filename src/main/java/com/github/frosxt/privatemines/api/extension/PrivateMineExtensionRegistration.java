package com.github.frosxt.privatemines.api.extension;

public interface PrivateMineExtensionRegistration extends AutoCloseable {

    @Override
    void close();
}