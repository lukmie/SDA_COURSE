package com.lukmie.zad2_homeworkNBP;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class OperationsTest {

    @Test
    public void testRoundUpValueEquals(){

        final double result = Operations.roundValue(4.12345,4);

        Assert.assertEquals(4.1235, result, 0);
    }

    @Test
    public void testRoundUpValueNotEquals(){

        final double result = Operations.roundValue(4.12345,4);

        Assert.assertNotEquals(4.1234, result, 0);
    }

    @Test
    public void testDateTimeSaturday(){

        LocalDateTime testDataTime = LocalDateTime.of(2019,5,11,0,0,5);

        final LocalDateTime localDateTime = Operations.checkDate(testDataTime);

        Assert.assertEquals(LocalDateTime.of(2019,5,10,0,0,5), localDateTime);
    }

    @Test
    public void testDateTimeSunday(){

        LocalDateTime testDataTime = LocalDateTime.of(2019,5,12,0,0,5);

        final LocalDateTime localDateTime = Operations.checkDate(testDataTime);

        Assert.assertEquals(LocalDateTime.of(2019,5,10,0,0,5), localDateTime);
    }


}
