package com.epam.tat.module4.junitTests;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

public class BaseCalculatorJunitTest {
    protected static Calculator calculator;

    @BeforeClass
    public static void setUp(){
        calculator = new Calculator();
    }
}
