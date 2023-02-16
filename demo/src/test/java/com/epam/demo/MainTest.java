package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testAllPositiveNumbers() {
        Main main = new Main();
        assertEquals(main.testNumbers(List.of("1", "2", "3", "5")), true);
    }
    @Test
    public void testAllPositiveNumbersWithNegative() {
        Main main = new Main();
        assertEquals(main.testNumbers(List.of()), true);
    }
}