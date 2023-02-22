package com.epam.utils;

import org.apache.commons.lang3.*;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return  NumberUtils.isCreatable(str) && NumberUtils.toDouble(str) > 0;
//        if (NumberUtils.toInt(str) <= 0) {
//            return false;
//        }
//        return true;
    }
}
