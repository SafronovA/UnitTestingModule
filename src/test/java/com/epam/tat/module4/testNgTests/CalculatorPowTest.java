package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorPowTest extends BaseCalculatorTestNgTest{
    private double arg1;
    private double arg2;
    private double expected;

    @Factory(dataProvider = "powDp")
    public CalculatorPowTest(double arg1, double arg2, double expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void testPow(){
        double result = Math.round(calculator.pow(arg1,arg2));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "powDp")
    public static Object [][] dp(){
        return new Object[][]{
                {5.0, 2.0, 25.0},
                {5.0, 2.5, 56.0}
        };
    }

}