package com.epam.tat.module4.junitTests;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class MultTest  extends BaseJunitTest {

    public MultTest(){}

    @Test
    @UseDataProvider("dataProviderDouble")
    public void testMult(double arg1, double arg2, double expected){
        double result = calculator.mult(arg1,arg2);
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    @UseDataProvider("dataProviderLong")
    public void testMult(long arg1, long arg2, long expected){
        long result = calculator.mult(arg1,arg2);
        Assert.assertEquals(expected, result, 0);
    }

    @DataProvider
    public static Object [][] dataProviderDouble(){
        return new Object[][]{
                {1, 0, 0.0},
                {1.1, 5.0, 5.5}
        };
    }

    @DataProvider
    public static Object [][] dataProviderLong(){
        return new Object[][]{
                {1, 0, 0},
                {5, 8, 40}
        };
    }

}