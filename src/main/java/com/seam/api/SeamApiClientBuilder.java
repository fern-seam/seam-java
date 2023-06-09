package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Environment;

public final class SeamApiClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment = Environment.DEFAULT;

    public SeamApiClientBuilder token(String token) {
        this.clientOptionsBuilder.addHeader("Authorization", "Bearer " + token);
        return this;
    }

    public SeamApiClientBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public SeamApiClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public SeamApiClient build() {
        clientOptionsBuilder.environment(this.environment);
        return new SeamApiClient(clientOptionsBuilder.build());
    }
}
