package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosTest extends BaseTestNgTest {
    private double arg1;
    private double expected;

    @Factory(dataProvider = "cosDataProvider")
    public CosTest(double arg1, double expected) {
        this.arg1 = Math.toRadians(arg1);
        this.expected = expected;
    }

    @Test
    public void testCos(){
        double result = calculator.cos(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "cosDataProvider")
    public static Object [][] dataProvider(){
        return new Object[][]{
                {0, 1.0},
                {60, 0.5},
        };
    }

}