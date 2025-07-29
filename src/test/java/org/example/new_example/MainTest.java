package org.example.new_example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Main;

public class MainTest {
    
    private Main main;
    
    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    public void testSumWithPositiveNumbers() {
        assertEquals(Integer.valueOf(8), main.sum(3, 5));
        assertEquals(Integer.valueOf(100), main.sum(45, 55));
    }

    @Test
    public void testSumWithNegativeNumbers() {
        assertEquals(Integer.valueOf(-8), main.sum(-3, -5));
        assertEquals(Integer.valueOf(-100), main.sum(-45, -55));
    }

    @Test
    public void testSumWithZero() {
        assertEquals(Integer.valueOf(5), main.sum(5, 0));
        assertEquals(Integer.valueOf(5), main.sum(0, 5));
        assertEquals(Integer.valueOf(0), main.sum(0, 0));
    }

    @Test
    public void testSumWithMixedSigns() {
        assertEquals(Integer.valueOf(2), main.sum(7, -5));
        assertEquals(Integer.valueOf(-2), main.sum(-7, 5));
        assertEquals(Integer.valueOf(0), main.sum(10, -10));
    }

    @Test
    public void testSumWithLargeNumbers() {
        assertEquals(Integer.valueOf(2000000000), main.sum(1000000000, 1000000000));
        assertEquals(Integer.valueOf(-2000000000), main.sum(-1000000000, -1000000000));
    }

    @Test
    public void testSumWithBoundaryValues() {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE - 1), main.sum(Integer.MAX_VALUE, -1));
        assertEquals(Integer.valueOf(Integer.MIN_VALUE + 1), main.sum(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSumOverflow() {
        // Test integer overflow behavior
        Integer result = main.sum(Integer.MAX_VALUE, 1);
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), result);
    }

    @Test
    public void testSumUnderflow() {
        // Test integer underflow behavior
        Integer result = main.sum(Integer.MIN_VALUE, -1);
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), result);
    }

    @Test
    public void testSumReturnType() {
        // Verify that the method returns an Integer object, not a primitive
        Integer result = main.sum(1, 2);
        assertNotNull(result);
        assertTrue(result instanceof Integer);
    }
}
