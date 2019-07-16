package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Practice Exercise - Question 6
 * Write a program, which reads number of students and n grades as input (of int
 * between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
 * program shall check for valid input. You should keep all the grades in an int[] and use a
 * method for each of the computations.
 */
public class StudentsGradeManagerTest {

    private StudentsGradeManager studentsGradeManager;

    @Before
    public void setUp() {
        studentsGradeManager = new StudentsGradeManager();
    }

    @After
    public void tearDown() {
        studentsGradeManager = null;
    }

    /**
     * Test to calculate average from given students grades.
     * Should return the average of all the grades divided by total number of grades.
     */
    @Test
    public void givenStudentGradesShouldReturnAverage() {
        /*Initialize int array containing grades*/
        int[] testStudentGrades = {86, 65, 98, 77};
        /*Add the grades to the StudentGradeManager object.*/
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("givenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                studentsGradeManager.calculateAverage(),
                0.0);
    }

    /**
     * Test for getting the maximum (highest) grade from the given array of
     * student grades.
     * Should return the highest integer from the integer array.
     */
    @Test
    public void givenStudentGradesShouldReturnMaximumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, studentsGradeManager.maximumGrade());
    }

    /**
     * Test for getting the minimum (lowest) grade from the given array of
     * student grades.
     */
    @Test
    public void givenStudentGradesShouldReturnMinimumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                65, studentsGradeManager.minimumGrade());
    }

    /**
     * Test calculateAverage by giving null value
     * as input. The method should throw a NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullArrayShouldReturnErrorMessage() {
        int[] testStudentGrades = null;
        /*Method should throw null pointer exception*/
        studentsGradeManager.addStudentGrades(testStudentGrades);
    }
}