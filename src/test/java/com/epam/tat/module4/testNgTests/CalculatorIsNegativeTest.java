package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends BaseCalculatorTestNgTest{
    private long arg1;
    private boolean expected;

    @Factory(dataProvider = "negDp")
    public CalculatorIsNegativeTest(long arg1, boolean expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Test
    public void testNegative(){
        boolean result = calculator.isNegative(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "negDp")
    public static Object [][] dp(){
        return new Object[][]{
                {2, false},
                {-2, true},
                {0, false}
        };
    }

}