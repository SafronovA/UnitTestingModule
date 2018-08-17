package com.epam.tat.module4.junitTests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CalculatorSubDoubleTest extends BaseCalculatorJunitTest {

    public CalculatorSubDoubleTest(){}

    @Test
    @UseDataProvider("dp")
    public void testSub(double arg1, double arg2, double expected){
        double result = calculator.sub(arg1,arg2);
        Assert.assertEquals(expected, result, 0.0);
    }

    @DataProvider
    public static Object [][] dp(){
        return new Object[][]{
                {1.0, 0.5, 0.5},
                {5, 8, -3}
        };
    }

}