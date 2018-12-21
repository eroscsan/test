package com.epam.assignment_elte.utils;

import java.util.List;

public class StringUtils {

    /**
     * If empty list adds empty
     * If list size 4 or smaller adds elements in order
     * If higher adds them in reversed order
     */
    public String join(String start, String end, List<?> list) {
        StringBuilder builder = new StringBuilder(start);
        if (list.isEmpty()) {
            builder.append("empty");
        } else if (list.size() < 4) {
            for (int i = 0; i < list.size(); i++) {
                builder.append(list.get(i));
            }
        } else {
            for (int i = list.size() - 1; i > 0; i--) {
                builder.append(list.get(i));
            }
        }
        return builder.append(end).toString();
    }

    /**
     * creates a new string from the nth characters of the input
     */
    public String nthElementsOnly(String input, int n) {
        String result = "";
        for (int i = n; i < input.length(); i += n) {
            result += input.charAt(i);
        }
        return result;
    }

}
