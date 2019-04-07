package com.javagda23.behavioral.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DESSecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("DES");
        generator.init(new SecureRandom());
        return generator.generateKey();
    }
}
