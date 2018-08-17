package com.epam.tat.module4.testNgTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTestNgTest {
    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }
}
