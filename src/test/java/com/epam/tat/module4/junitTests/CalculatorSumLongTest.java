package com.epam.tat.module4.junitTests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CalculatorSumLongTest extends BaseCalculatorJunitTest {

    public CalculatorSumLongTest(){}

    @Test
    @UseDataProvider("dp")
    public void testSum(long arg1, long arg2, long expected){
        long result = calculator.sum(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }

    @DataProvider
    public static Object [][] dp(){
        return new Object[][]{
                {1, 1, 2},
                {5, 8, 13}
        };
    }

}

