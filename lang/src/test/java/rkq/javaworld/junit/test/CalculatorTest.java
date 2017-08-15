package rkq.javaworld.junit.test;

import org.junit.Test;
import rkq.javaworld.lang.junit.Calculator;

import static org.junit.Assert.assertEquals;

/**
 * Created by rick on 8/15/17.
 */
public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
