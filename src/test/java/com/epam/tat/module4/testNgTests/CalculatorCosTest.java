package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorCosTest extends BaseCalculatorTestNgTest{
    private double arg1;
    private double expected;

    @Factory(dataProvider = "cosDp")
    public CalculatorCosTest(double arg1, double expected) {
        this.arg1 = Math.toRadians(arg1);
        this.expected = expected;
    }

    @Test
    public void testCos(){
        double result = calculator.cos(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "cosDp")
    public static Object [][] dp(){
        return new Object[][]{
                {0, 1.0},
                {60, 0.5},
        };
    }

}