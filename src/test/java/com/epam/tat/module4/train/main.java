package com.epam.tat.module4.train;

import com.epam.tat.module4.testNgTests.BaseCalculatorTestNgTest;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static java.lang.Math.*;
import static org.testng.Assert.assertEquals;

public class main extends BaseCalculatorTestNgTest {

@Test()
    public void sin0(){
    double result = calculator.sin(0);
    assertEquals(result, 0.0);
}

@Test(groups = "a")
    public void sin30(){
    double result = round(calculator.sin(Math.PI/4));
    assertEquals(result, 1.0);
}

@Test
    public void sin45(){
    double result =  Math.sqrt(-2);
    assertEquals(result, Double.NaN);
}

    public static void main(String[] args) {
   Calculator calculator = new Calculator();
        System.out.println(calculator.isPositive(-2));

         }
}
