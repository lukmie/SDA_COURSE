package com.javagda23.test_tdd;

import com.javagda23.zad3_tdd.LiczbaPierwsza;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LiczbaPierwszaParamTest {
    private int liczba;
    private boolean czyPierwsza;

    public LiczbaPierwszaParamTest(int liczba, boolean czyPierwsza) {
        this.liczba = liczba;
        this.czyPierwsza = czyPierwsza;
    }

    @Test
    public void czyPierwszaTest(){
        Assert.assertEquals(czyPierwsza, LiczbaPierwsza.czyPierwsza(liczba));
    }

    @Parameterized.Parameters(name = "{index}: czy liczba {0} jest pierwsza? {1}")
    public static Collection<Object[]> wczytajDane(){
        return Arrays.asList(new Object[][]{
                {4, false},
                {77, false},
                {7, true}
        });

    }

}
