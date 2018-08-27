package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTestNgTest {
    private double arg1;
    private double arg2;
    private double expected;

    @Factory(dataProvider = "dataProvider")
    public DivDoubleTest(double arg1, double arg2, double expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test(dependsOnGroups = "div")
    public void testDiv(){
        double result = calculator.div(arg1,arg2);
        Assert.assertEquals(result, expected);
    }

    @Test (expectedExceptions = NumberFormatException.class, dependsOnGroups = "div")
    public void testDivException(){
        calculator.div(2.0,0);
    }

    @DataProvider(name = "dataProvider")
    public static Object [][] dataProvider(){
        return new Object[][]{
                {1.0, 1.0, 1.0},
                {55.5, 5, 11.1}
        };
    }

}