package com.upgrad.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;

    private ByteArrayInputStream testInput;
    private ByteArrayOutputStream testOutput;

    @BeforeEach
    public void setUp() {
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));
    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testApp() {
        String inputString = "Hello, World!";
        testInput = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(testInput);

        App.main(new String[0]);

        String expectedOutput = "Enter the input string: the string enterd is, Hello, World!\n" +
                                "the length of string is, 13\n";

        assertEquals(expectedOutput, testOutput.toString());
    }
}

