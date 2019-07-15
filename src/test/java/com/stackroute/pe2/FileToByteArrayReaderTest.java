package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileToByteArrayReaderTest {

    private FileToByteArrayReader fileToByteArrayReader;

    @Before
    public void setUp() {
        fileToByteArrayReader = new FileToByteArrayReader();
    }

    @After
    public void tearDown() {
        fileToByteArrayReader = null;
    }

    @Test
    public void testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, fileToByteArrayReader.readFile("test", "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureGivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        fileToByteArrayReader.readFile("test1", "txt");
    }
}