package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgTest extends BaseTestNgTest {
    private double arg1;
    private double expected;

    @Factory(dataProvider = "tgDataProvider")
    public TgTest(double arg1, double expected) {
        this.arg1 = Math.toRadians(arg1);
        this.expected = expected;
    }

    @Test
    public void testTg(){
        double result = calculator.tg(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "tgDataProvider")
    public static Object [][] dataProvider(){
        return new Object[][]{
                {0, 0.0},
                {60, Math.sqrt(3)},
        };
    }

}