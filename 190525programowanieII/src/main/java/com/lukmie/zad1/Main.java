package com.lukmie.zad1;

import static com.lukmie.zad1.Benchmark.*;

public class Main {

    public static void main(String[] args) {

        benchmarkArrayListAdd();
        benchmarkLinkedListAdd();
        benchmarkArrayListAddAtIndex();
        benchmarkLinkedListAddAtIndex();
        benchmarkArrayListRemoveObject();
        benchmarkLinkedListRemoveObject();
        benchmarkArrayListRemoveAtIndex();
        benchmarkLinkedListRemoveAtIndex();
        benchmarkArrayListGetObject();
        benchmarkLinkedListGetObject();

    }

}
