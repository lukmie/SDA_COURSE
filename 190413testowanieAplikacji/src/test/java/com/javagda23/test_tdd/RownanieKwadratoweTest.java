package com.javagda23.test_tdd;

import com.javagda23.zad4_tddRownanieKwadratowe.RownanieKwadratowe;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RownanieKwadratoweTest {
    @Parameterized.Parameter(value = 0)
    public int a;

    @Parameterized.Parameter(value = 1)
    public int b;

    @Parameterized.Parameter(value = 2)
    public int c;

    @Parameterized.Parameter(value = 3)
    public String pierwiastki;

    @Parameterized.Parameters
    public static Collection<Object[]> wczytajDane() {
        return Arrays.asList(new Object[][]{
                {10, 1, 1, ""},
                {2, 5, 10, ""},
                {1, -2, 1, "1"},
                {1, 5, 4, "-4,-1"}
        });
    }

    @Test
    public void rownanieTest() {
        Assert.assertEquals(pierwiastki, RownanieKwadratowe.oblicz(a, b, c));
    }


}
