package com.lukmie.zad2_homeworkNBP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConnectionTest {

    private Table table;
    private String nationality;
    private long daysAgo;

    @Before
    public void setUp(){
        table = Table.C;
        nationality = Currencies.GBP.getCode();
        daysAgo = 0;
    }

    @Test
    public void jsonToObject() throws Exception {

        Connection connection = new Connection();

        Currency currency = connection.getJsonFromURL(table, nationality, daysAgo);
        Assert.assertNotNull(currency);
        Assert.assertEquals("GBP", currency.getCode());
        Assert.assertEquals(4.9988, currency.getAskValue(), 0.5);
    }
}
