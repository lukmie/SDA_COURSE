package com.javagda23.test_tddKalkulator;

import com.javagda23.zad5_tddKalkulatorWieku.KalkulatorWieku;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KalkulatorWiekuTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void poprawnyFormatDatyUrodzenia(){
        exception.expect(RuntimeException.class);
        exception.expectMessage("Data urodzenia");
        KalkulatorWieku.obliczWiek("2000-01-01", "10-10-2010");
    }

    @Test
    public void poprawnyFormatWybranejDaty(){
        exception.expect(RuntimeException.class);
        exception.expectMessage("Wybrana data");
        KalkulatorWieku.obliczWiek("10-10-2010", "2000-01-01");
    }

    @Test
    public void dataUrodzeniaMusiBycNieWiekszaOdWybranejDaty(){
        exception.expect(RuntimeException.class);
        exception.expectMessage("Data urodzenia nie moze byc pozniej niz");
        KalkulatorWieku.obliczWiek("01-01-2000", "01-01-1990");
    }

    @Test
    public void dzienPrzedUrodzinamiOsobaJestRokMlodza(){
        Assert.assertEquals(10, KalkulatorWieku.obliczWiek("02-05-2000", "01-05-2011"));
    }

    @Test
    public void osobaNieMozeMiecWiecejNiz120Lat(){
        exception.expect(RuntimeException.class);
        exception.expectMessage("120 lat");
        KalkulatorWieku.obliczWiek("10-10-0010", "10-10-2000");
    }

}
