package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorCtgTest extends BaseCalculatorTestNgTest{
    private double arg1;
    private double expected;

    @Factory(dataProvider = "ctgDp")
    public CalculatorCtgTest(double arg1, double expected) {
        this.arg1 = Math.toRadians(arg1);
        this.expected = expected;
    }

    @Test
    public void testCtg(){
        double result = calculator.ctg(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "ctgDp")
    public static Object [][] dp(){
        return new Object[][]{
                {45, 1.0},
                {60, Math.sqrt(3)/3},
        };
    }

}