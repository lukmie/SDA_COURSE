package com.javagda23.behavioral.template;

public abstract class PerformanceTestTemplate {
    public abstract void iteration();

    public abstract int getWarmupIterationNum();

    public abstract int getIterationsNum();

    public void run() {
        for (int i = 0; i < getWarmupIterationNum(); i++) {
            iteration();
        }

        final long start = System.currentTimeMillis();
        for (int i = 0; i < getIterationsNum(); i++) {
            iteration();
        }
        final long end = System.currentTimeMillis();
        System.out.println((end - start) / getIterationsNum());
    }

}
