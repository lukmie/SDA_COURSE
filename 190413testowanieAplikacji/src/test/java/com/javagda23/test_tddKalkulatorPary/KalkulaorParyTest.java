package com.javagda23.test_tddKalkulatorPary;

import com.javagda23.zad1.Kalkulator;
import com.javagda23.zad6_tddKalkulator.KalkulatorPary;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KalkulaorParyTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Ignore
    @Test(expected = RuntimeException.class)
    public void nieWiecejNizDwieLiczby() {
        KalkulatorPary.dodaj("1,2,3");
    }

    @Test(expected = RuntimeException.class)
    public void pustyTekstDajeZero() {
        Assert.assertEquals(0, KalkulatorPary.dodaj(""));
    }

    @Test
    public void zwracaSumeDwochWprowadzonychLiczb() {
        Assert.assertEquals(10, KalkulatorPary.dodaj("5,5"));
    }

    @Test
    public void zwracaSumeDowolnejIlosciWprowadzonychLiczb() {
        Assert.assertEquals(60, KalkulatorPary.dodaj("20,20,20"));
    }

    @Test
    public void dozwoloneSaZnakiNowejLinii() {
        Assert.assertEquals(10, KalkulatorPary.dodaj("5\n,\n5"));
    }

    @Test
    public void dozwoloneSaRozneZnaki() {
        Assert.assertEquals(3, KalkulatorPary.dodaj("//;\\n1;2"));
    }

    @Test
    public void niedozwoloneLiczbyUjemne() {
        exception.expect(RuntimeException.class);
        exception.expectMessage("-5, -10");
        KalkulatorPary.dodaj("-5, 5, -10");
    }

    @Test
    public void wiekszeLiczbyNiz1000SaIgnorowane() {
        Assert.assertEquals(1020, KalkulatorPary.dodaj("1,1001,19,1000"));
    }

    @Test
    public void separatoryMogaBycRoznejDlugosci_1() {
        Assert.assertEquals(10, KalkulatorPary.dodaj("//!!\\n1!!2!!3!!4"));
    }

    @Test
    public void separatoryMogaBycRoznejDlugosci_2() {
        Assert.assertEquals(6, KalkulatorPary.dodaj("//ooo\\n1ooo2ooo3"));
    }

    @Test
    public void wsparcieDlaWieluSeparatorow_1() {
        Assert.assertEquals(6, KalkulatorPary.dodaj("//{%\\n1{2%3"));
    }

    @Test
    public void wsparcieDlaWieluSeparatorow_2() {
        Assert.assertEquals(7, KalkulatorPary.dodaj("//abY\\n1Y2Y1a3b"));
    }

    @Test
    public void wsparcieDlaWieluSeparatorowODowolnejDlugosci_1() {
        Assert.assertEquals(6, KalkulatorPary.dodaj("//:::%%\\n1:::2%%3"));
    }

    @Test
    public void wsparcieDlaWieluSeparatorowODowolnejDlugosci_2() {
        Assert.assertEquals(7, KalkulatorPary.dodaj("//abbbbXX\\n1XX2XX1a3bbbb"));
    }
}
