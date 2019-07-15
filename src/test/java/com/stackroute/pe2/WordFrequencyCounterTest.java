package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

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

    @Test
    public void testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount() {
        HashMap<String, Integer> expectedWordCound = new HashMap<>();
        expectedWordCound.put("i", 3);
        expectedWordCound.put("am", 1);
        expectedWordCound.put("like", 1);
        expectedWordCound.put("have", 1);
        expectedWordCound.put("a", 2);
        assertEquals("testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount: check calculateWordFrequency()",
                expectedWordCound, wordFrequencyCounter.calculateWordFrequency("test_files/FileDemo.txt"));
    }

    @Test
    public void testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull() {
        assertNull("testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull: check calculateWordFrequency(). Should return null.",
                wordFrequencyCounter.calculateWordFrequency("testFile.txt"));
    }
}