package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivTest extends BaseTestNgTest{
    private double arg1D;
    private double arg2D;
    private double expectedD;

    private long arg1L;
    private long arg2L;
    private long expectedL;


    @Factory(dataProvider = "dataProviderDouble")
    public DivTest(double arg1, double arg2, double expected) {
        this.arg1D = arg1;
        this.arg2D = arg2;
        this.expectedD = expected;
    }

    @Factory(dataProvider = "dataProviderLong")
    public DivTest(long arg1, long arg2, long expected) {
        this.arg1L = arg1;
        this.arg2L = arg2;
        this.expectedL = expected;
    }


    @Test(dataProvider = "dataProviderDouble", groups = "div")
    public void testDivDouble(double arg1D, double arg2D, double expectedD){
        double result = calculator.div(arg1D,arg2D);
        Assert.assertEquals(result, expectedD);
    }

    @Test(dataProvider = "dataProviderLong", groups = "div")
    public void testDivLong(long arg1L, long arg2L, long expectedL){
        long result = calculator.div(arg1L,arg2L);
        Assert.assertEquals(result, expectedL);
    }

    @Test (expectedExceptions = NumberFormatException.class, dependsOnGroups = "div")
    public void testDivDoubleException(){
        calculator.div(2.0,0.0);
    }

    @Test (expectedExceptions = NumberFormatException.class, dependsOnGroups = "div")
    public void testDivLongException(){
        calculator.div(2,0);
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
