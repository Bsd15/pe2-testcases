package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testCalculateAverageGivenStudentGradesShouldReturnAverage() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("testCalculateAverageGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                studentsGradeManager.calculateAverage(),
                0.0);
    }

    @Test
    public void testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, studentsGradeManager.maximumGrade());
    }

    @Test
    public void testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGradeManager.addStudentGrades(testStudentGrades);
        assertEquals("testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                65, studentsGradeManager.minimumGrade());
    }
}