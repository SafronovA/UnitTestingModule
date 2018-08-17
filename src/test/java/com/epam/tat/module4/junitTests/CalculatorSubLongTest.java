package com.epam.tat.module4.junitTests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CalculatorSubLongTest extends BaseCalculatorJunitTest {

    public CalculatorSubLongTest(){}

    @Test
    @UseDataProvider("dp")
    public void testSub(long arg1, long arg2, long expected){
        long result = calculator.sub(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }

    @DataProvider
    public static Object [][] dp(){
        return new Object[][]{
                {1, 0, 1},
                {8, 5, 3}
        };
    }

}