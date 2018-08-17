package com.epam.tat.module4.testNgTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CalculatorDivDoubleExceptionTest extends BaseCalculatorTestNgTest{
    private double arg1;
    private double arg2;

    @Factory(dataProvider = "divLDp")
    public CalculatorDivDoubleExceptionTest(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Test(expectedExceptions = NumberFormatException.class, dependsOnGroups = "div")
    public void testDivException(){
        calculator.div(arg1,arg2);
    }

    @DataProvider(name = "divLDp")
    public static Object [][] dp(){
        return new Object[][]{
                {1.0, 0},
                {55.0, 0}
        };
    }

}