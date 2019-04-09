package com.javagda23.behavioral.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortingPerformanceTest extends PerformanceTestTemplate {

    @Override
    public void iteration() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integerList.add(new Random().nextInt());
        }
        integerList.sort(Comparator.naturalOrder());
    }

    @Override
    public int getWarmupIterationNum() {
        return 3;
    }

    @Override
    public int getIterationsNum() {
        return 100;
    }
}
