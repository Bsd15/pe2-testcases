package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {

    private FactorialCalculator factorialCalculator;
    @Before
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @After
    public void tearDown() {
        factorialCalculator = null;
    }

    @Test
    public void testIntFactorialSuccessGivenNumberShouldReturnFactorial() {
        assertEquals("testIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(1));

        assertEquals("testIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(2));

        assertEquals("testIntFactorialGivenNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(12));
    }

    @Test
    public void testIntFactorialFailureGivenNumberShouldReturnNegativeOne() {
        assertEquals("testIntFactorialGivenNumberShouldReturnFactorial: check intFactorial(), Should have returned -1",
                -1, factorialCalculator.intFactorial(13));
    }

    @Test
    public void testLongFactorialSuccessGivenNumberShouldReturnFactorial() {
        assertEquals("testLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(1));

        assertEquals("testLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(2));

        assertEquals("testLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(13));

        assertEquals("testLongFactorialSuccessGivenNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(20));
    }

    @Test
    public void  testLongFactorialFailureGivenNumberShouldReturnNegativeOne() {
        assertEquals("testLongFactorialFailureGivenNumberShouldReturnNegativeOne: Check longFactorial(), Should return -1",
                -1, factorialCalculator.longFactorial(21));
    }
}