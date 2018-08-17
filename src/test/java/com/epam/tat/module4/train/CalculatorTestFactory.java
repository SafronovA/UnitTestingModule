package com.epam.tat.module4.train;

import com.epam.tat.module4.junitTests.CalculatorSumLongTest;
import org.testng.annotations.Factory;

public class CalculatorTestFactory {

    @Factory
    public Object[] generateTests(){
        return new Object[]{
                new CalculatorSumLongTest(1, 2, 3),
                new CalculatorSumLongTest(-1, 2, 1)
                };
    }
}
