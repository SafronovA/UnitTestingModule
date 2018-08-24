package com.epam.tat.module4.testNgTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTestNgTest {
    private double arg1;
    private double expected;

    @Factory(dataProvider = "sqrtDataProvider")
    public SqrtTest(double arg1, double expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Test
    public void testSqrt(){
        double result = calculator.sqrt(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sqrtDataProvider")
    public static Object [][] dataProvider(){
        return new Object[][]{
                {1.0, 1.0},
                {25.0, 5.0},
                {-25.0, Double.NaN}
        };
    }

}