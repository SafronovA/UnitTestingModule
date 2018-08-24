package com.epam.tat.module4.testNgTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivLongExceptionTest extends BaseTestNgTest {
    private long arg1;
    private long arg2;

    @Factory(dataProvider = "divLDp")
    public DivLongExceptionTest(long arg1, long arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Test (expectedExceptions = NumberFormatException.class, groups = "div")
    public void testDivExeption(){
        calculator.div(arg1,arg2);
    }

    @DataProvider(name = "divLDp")
    public static Object [][] dp(){
        return new Object[][]{
                {1, 0},
                {55, 0}
        };
    }

}