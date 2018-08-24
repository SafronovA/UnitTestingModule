package com.epam.tat.module4.junitTests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SumTest extends BaseJunitTest {

    public SumTest() {}

    @Test
    @UseDataProvider("dataProviderDouble")
    public void testSum(double arg1, double arg2, double expected){
        double result = calculator.sum(arg1,arg2);
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    @UseDataProvider("dataProviderLong")
    public void testSum(long arg1, long arg2, long expected){
        long result = calculator.sum(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }

    @DataProvider
    public static Object [][] dataProviderDouble(){
        return new Object[][]{
                {1, 1, 2},
                {0.5, 1.8, 2.3}
        };
    }

    @DataProvider
    public static Object [][] dataProviderLong(){
        return new Object[][]{
                {1, 1, 2},
                {5, 8, 13}
        };
    }

}