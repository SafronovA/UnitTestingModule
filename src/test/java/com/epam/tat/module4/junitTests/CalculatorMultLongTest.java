package com.epam.tat.module4.junitTests;

import com.epam.tat.module4.testNgTests.BaseCalculatorTestNgTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CalculatorMultLongTest extends BaseCalculatorJunitTest {

    public CalculatorMultLongTest(){}

    @Test
    @UseDataProvider("dp")
    public void testMult(long arg1, long arg2, long expected){
        long result = calculator.mult(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }

    @DataProvider
    public static Object [][] dp(){
        return new Object[][]{
                {1, 0, 0},
                {5, 8, 40}
        };
    }

}