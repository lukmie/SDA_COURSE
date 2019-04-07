package com.javagda23.behavioral.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    private SecretKeyGenerationStrategy secretKeyGenerationStrategy;

    public SecretKeyGenerator(SecretKeyGenerationStrategy secretKeyGenerationStrategy) {
        this.secretKeyGenerationStrategy = secretKeyGenerationStrategy;
    }

    public SecretKey create() throws NoSuchAlgorithmException {
        return secretKeyGenerationStrategy.generate();
    }
}
