package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorSqrtTest extends BaseCalculatorTestNgTest{
    private double arg1;
    private double expected;

    @Factory(dataProvider = "sqrtDp")
    public CalculatorSqrtTest(double arg1, double expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Test
    public void testSqrt(){
        double result = calculator.sqrt(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sqrtDp")
    public static Object [][] dp(){
        return new Object[][]{
                {1.0, 1.0},
                {25.0, 5.0},
                {-25.0, Double.NaN}
        };
    }

}