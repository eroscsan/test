package com.epam.assignment_elte.utils;

import java.util.List;

public class Finder {

    /**
     * Returns target location or -1 if not found
     */
    public int find(List<Integer> list, Integer target) {
        if (list == null || target == null) {
            throw new IllegalArgumentException("null argument");
        }
        int result = 1;
        for (Integer item : list) {
            if (item.equals(target)) {
                return result;
            }
            result++;
        }
        return -1;
    }

}
