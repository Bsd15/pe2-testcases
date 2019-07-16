package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Practice Exercise - Question 9
 * Write a program to calculate the frequency of the words in a given file
 */
public class WordFrequencyCounterTest {
    private WordFrequencyCounter wordFrequencyCounter;
    @Before
    public void setUp() {
        wordFrequencyCounter = new WordFrequencyCounter();
    }

    @After
    public void tearDown() {
        wordFrequencyCounter = null;
    }

    /**
     * Test should return expected word count when
     * FilesDemo.txt is given as input.
     */
    @Test
    public void givenFilePathShouldReturnWordCount() {
        HashMap<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("i", 3);
        expectedWordCount.put("am", 1);
        expectedWordCount.put("like", 1);
        expectedWordCount.put("have", 1);
        expectedWordCount.put("a", 2);
        assertEquals("givenFilePathShouldReturnWordCount: check calculateWordFrequency()",
                expectedWordCount, wordFrequencyCounter.calculateWordFrequency("test_files/FileDemo.txt"));
    }

    /**
     * Test whether the method return null when a wrong file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void givenFilePathShouldReturnNull() {
        /*Calling this method should throw FileNotFoundException*/
        wordFrequencyCounter.calculateWordFrequency("test_file.txt");
    }
}