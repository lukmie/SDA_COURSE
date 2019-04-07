package com.javagda23.behavioral.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public interface SecretKeyGenerationStrategy {
    SecretKey generate() throws NoSuchAlgorithmException;
}
