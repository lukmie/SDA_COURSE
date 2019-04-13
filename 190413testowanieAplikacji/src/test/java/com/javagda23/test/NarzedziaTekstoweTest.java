package com.javagda23.test;

import com.javagda23.zad2.NarzedziaTekstowe;
import org.junit.Assert;
import org.junit.Test;

public class NarzedziaTekstoweTest {
    @Test
    public void zamienTestNaTEST(){
        Assert.assertEquals("TEST", NarzedziaTekstowe.zamienNaDuzeZnaki("test"));
    }

    @Test
    public void odwrocTekstTest(){
        Assert.assertEquals("abc", NarzedziaTekstowe.odwrocString("cba"));
    }

    @Test
    public void zwielokrotnijStringaTest(){
        Assert.assertEquals("test test test", NarzedziaTekstowe.zwielokrotnijString("test", 3));
    }


}
