package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertEquals(StringUtils.isPositiveNumber("1"), true);
        assertEquals(StringUtils.isPositiveNumber("-11"), false);
    }
}