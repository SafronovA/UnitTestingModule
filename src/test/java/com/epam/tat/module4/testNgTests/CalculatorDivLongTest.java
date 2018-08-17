package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorDivLongTest extends BaseCalculatorTestNgTest{
    private long arg1;
    private long arg2;
    private long expected;

    @Factory(dataProvider = "divLDp")
    public CalculatorDivLongTest(long arg1, long arg2, long expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test(groups = "div")
    public void testDiv(){
        long result = calculator.div(arg1,arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "divLDp")
    public static Object [][] dp(){
        return new Object[][]{
                {1, 1, 1},
                {55, 5, 11}
        };
    }

}