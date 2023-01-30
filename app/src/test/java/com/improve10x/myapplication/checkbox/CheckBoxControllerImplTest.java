package com.improve10x.myapplication.checkbox;

import junit.framework.TestCase;

import org.junit.Assert;

public class CheckBoxControllerImplTest extends TestCase {

    public void testCreateOrderDetails() {
        String expectedOutput = "Selected Items : \nPizza : 100Rs\nCoffee : 50Rs\nBurger : 120Rs\nTotal : 270Rs";
        String actualOutput = new CheckBoxControllerImpl().createOrderDetails(true,
                true, true);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}