package com.jwu.graduate.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTools
{
    public static boolean isPositiveInteger(String str)
    {
        Pattern pattern = Pattern.compile("^[1-9]\\d*|0$");

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean isNegativeInteger(String str)
    {
        Pattern pattern = Pattern.compile("^-[1-9]\\d*|0$");

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
