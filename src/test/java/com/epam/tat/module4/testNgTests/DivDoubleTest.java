package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivTest extends BaseTestNgTest {
    private double arg1;
    private double arg2;
    private double expected;

    private long larg1;
    private long larg2;
    private long lexpected;

    @Factory(dataProvider = "dataProviderDouble")
    public DivTest(double arg1, double arg2, double expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Factory(dataProvider = "dataProviderLong")
    public DivTest(long arg1, long arg2, long expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test(dependsOnGroups = "div")
    public void testDivD(){
        double result = calculator.div(arg1,arg2);
        Assert.assertEquals(result, expected);
    }

    @Test(groups = "div")
    public void testDivL(){
        long result = calculator.div(larg1,larg2);
        Assert.assertEquals(result, lexpected);
    }

    @DataProvider(name = "dataProviderDouble")
    public static Object [][] dataProviderDouble(){
        return new Object[][]{
                {1.0, 1.0, 1.0},
                {55.5, 5, 11.1}
        };
    }

    @DataProvider(name = "dataProviderLong")
    public static Object [][] dataProviderLong(){
        return new Object[][]{
                {1, 1, 1},
                {55, 5, 11}
        };
    }

}