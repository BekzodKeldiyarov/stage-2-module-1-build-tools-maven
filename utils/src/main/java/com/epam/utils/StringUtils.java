package com.epam.utils;

import static org.apache.commons.lang3.time.DurationUtils.isPositive;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        return Integer.parseInt(str) > 0;
    }
}
