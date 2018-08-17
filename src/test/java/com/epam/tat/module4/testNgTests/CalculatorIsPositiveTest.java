package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends BaseCalculatorTestNgTest{
    private long arg1;
    private boolean expected;

    @Factory(dataProvider = "posDp")
    public CalculatorIsPositiveTest(long arg1, boolean expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Test
    public void testPositive(){
        boolean result = calculator.isPositive(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "posDp")
    public static Object [][] dp(){
        return new Object[][]{
                {2, true},
                {-2, false},
                {0, false}
        };
    }

}