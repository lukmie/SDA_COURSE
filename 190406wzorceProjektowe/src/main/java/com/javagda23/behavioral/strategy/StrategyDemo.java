package com.javagda23.behavioral.strategy;

import java.security.NoSuchAlgorithmException;

public class StrategyDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SecretKeyGenerationStrategy strategyA = new AESSecretKeyGenerationStrategy();
        SecretKeyGenerationStrategy strategyB = new DESSecretKeyGenerationStrategy();

        SecretKeyGenerator generator = new SecretKeyGenerator(strategyA);
        System.out.println(generator.create().getAlgorithm());
    }
}
