package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    Main main = new Main();
    @Test
    public void testSumWithNegativeIntegers() {

        int result = main.sum(-5, -7);
        assertEquals(-12, result, "Sum of two negative integers should be correct");
    }

    @Test
    public void testSumWithPositiveIntegers() {
//        Main main = new Main();
        int result = main.sum(3, 7);
        assertEquals(10, result, "Sum of two positive integers should be correct");
    }

    @Test
    public void testSumWithPositiveAndNegativeInteger() {
//        Main main = new Main();
        int result = main.sum(10, -4);
        assertEquals(6, result, "Sum of a positive and a negative integer should be correct");
    }

    @Test
    public void testMainPrintsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[]{});
        System.setOut(originalOut);
        String output = outContent.toString().trim();
        assertEquals("Hello, World!", output, "main should print 'Hello, World!'");
    }

    @Test
    public void testSumWithZeros() {
        Main main = new Main();
        int result = main.sum(0, 0);
        assertEquals(0, result, "Sum of two zeros should be zero");
    }

    @Test
    public void testSumWithIntegerOverflow() {
        Main main = new Main();
        int result = main.sum(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result, "Sum should overflow to Integer.MIN_VALUE");
    }
}
