package com.javagda23;

import com.javagda23.zad1.Kalkulator;
import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {
    @Test
    public void dwaDoDrugiejDaje4(){
        Assert.assertEquals(4, Kalkulator.potega(2,2));
    }

    @Test
    public void dwaDoZerowejDajeJeden(){
        Assert.assertEquals(1, Kalkulator.potega(2,0));
    }

    @Test
    public void zeroDoDrugiejDajeZero(){
        Assert.assertEquals(0, Kalkulator.potega(0,2));
    }

    @Test
    public void szescPodzielnePrzezTrzy(){
        Assert.assertTrue(Kalkulator.czyLiczbaPodzielnaPrzez(6,3));
    }

    @Test
    public void siedemNiepodzielnePrzezTrzy(){
        Assert.assertFalse(Kalkulator.czyLiczbaPodzielnaPrzez(7,3));
    }

    @Test
    public void osiemNiepodzielnePrzezZero(){
        Assert.assertFalse(Kalkulator.czyLiczbaPodzielnaPrzez(8,0));
    }
}
