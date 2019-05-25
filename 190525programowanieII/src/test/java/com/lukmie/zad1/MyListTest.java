package com.lukmie.zad1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MyListTest {

    MyList<Object> list;

    @Before
    public void setUp(){
        list = new MyList<>();
    }

    @Test
    public void shouldReturnZero(){
        Assert.assertEquals(0, list.getSize());
    }

    @Test
    public void shouldReturnTwoForListWithTwoElements(){
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());

        list.getSize();
        Assert.assertEquals(4, list.getSize());
    }

    @Test
    public void getShouldReturnNullIfListIsEmpty(){
        Assert.assertEquals(null, list.get(0));
    }

    @Test
    public void getShouldReturnNullIfIndexIsLessThan0(){
        Assert.assertEquals(null, list.get(-1));
    }

    @Test
    public void getShouldReturnFirstElementForZero(){
        Object object = new Object();
        list.add(object);
        Assert.assertEquals(object, list.get(0));
    }

    @Test
    public void getShouldReturnRequestedelement(){
        Object object = new Object();
        Integer integer = new Integer(4);
        list.add(object);
        list.add(integer);
        Assert.assertEquals(integer, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addElementAtIndexLessThanZeroReturnException() {
        list.insert(-1, new Object());
    }

    @Test
    public void addElementAtIndexZero() {
        Object object = new Object();
        list.insert(0, object);
        list.insert(1, object);
        list.insert(2, object);
        Assert.assertEquals(object, list.get(0));
    }
}
