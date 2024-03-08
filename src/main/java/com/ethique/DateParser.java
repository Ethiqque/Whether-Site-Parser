package com.ethique;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateParser {
    private Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");

    public String getDateFromString(String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()){
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");
    }
}
