package com.javagda23.test_tdd;

import com.javagda23.zad3_tdd.LiczbaPierwsza;
import org.junit.Assert;
import org.junit.Test;

public class LiczbaPierwszaTest {
    @Test
    public void dwaJestLiczbaPierwsza(){
        Assert.assertTrue(LiczbaPierwsza.czyPierwsza(2));
    }

    @Test
    public void szescNieJestLiczbaPierwsza(){
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(6));
    }

    @Test
    public void zeroNieJestLiczbaPierwsza() {
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(0));
    }

    @Test
    public void dziewiecNieJestLiczbaPierwsza(){
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(9));
    }

    @Test
    public void liczba25NieJestLiczbaPierwsza(){
        Assert.assertFalse(LiczbaPierwsza.czyPierwsza(25));
    }
}
