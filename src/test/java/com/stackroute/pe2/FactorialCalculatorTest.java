package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Java Practice Exercise - Question - 7
 * Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
 * signed integer).
 */
public class FactorialCalculatorTest {
    /*Instance variable to be used in all test cases*/
    private FactorialCalculator factorialCalculator;

    @Before
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @After
    public void tearDown() {
        factorialCalculator = null;
    }

    /**
     * Test case for intFactorial().
     * Test for the success conditions of the method.
     */
    @Test
    public void givenIntNumberShouldReturnFactorial() {
        assertEquals("givenIntNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(1));

        assertEquals("givenIntNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(2));

        assertEquals("givenIntNumberShouldReturnFactorial: check intFactorial()",
                1, factorialCalculator.intFactorial(12));
    }

    /**
     * Test for intFactorial()
     * Test for failure conditions of the method.
     * Given an input which is out of range, the method should return -1
     */
    @Test
    public void givenIntNumberShouldReturnNegativeOne() {
        assertEquals("givenIntNumberShouldReturnNegativeOne: check intFactorial(), Should have returned -1",
                -1, factorialCalculator.intFactorial(13));
    }

    /**
     * Test for intFactorial() to check if the method returns null when
     * null is given as input.
     */
    @Test
    public void givenNullShouldReturnNegativeOne() {
        assertNull("givenNullShouldReturnNegativeOne: check intFactorial(). Method should return null.",
                factorialCalculator.intFactorial(null));
    }

    /**
     * Test for longFactorial()
     * Test for Success condition of the method.
     * The test gives in a long Number and the method should return
     * the factorial of the number.
     */
    @Test
    public void givenLongNumberShouldReturnFactorial() {
        assertEquals("givenLongNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(1));

        assertEquals("givenLongNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(2));

        assertEquals("givenLongNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(13));

        assertEquals("givenLongNumberShouldReturnFactorial: Check longFactorial()",
                1, factorialCalculator.longFactorial(20));
    }

    /**
     * Tests for longFactorial() to check if the method return -1 if
     * the factorial of the given number crosses the limit.
     */
    @Test
    public void  givenLongNumberShouldReturnNegativeOne() {
        assertEquals("testLongFactorialFailureGivenNumberShouldReturnNegativeOne: Check longFactorial(), Should return -1",
                -1, factorialCalculator.longFactorial(21));
    }

    /**
     * Test for longFactorial() to check if the method returns null when
     * null is given as input.
     */
    @Test
    public void givenNullShouldReturnNegativeOne() {
        assertNull("givenNullShouldReturnNegativeOne: check longFactorial(). Method should return null.",
                factorialCalculator.longFactorial(null));
    }
}