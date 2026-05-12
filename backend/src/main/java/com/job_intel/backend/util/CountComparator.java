package com.job_intel.backend.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CountComparator implements Comparator<Map.Entry<Integer, Integer>> {


    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return Integer.compare(o2.getValue(),o1.getValue());
    }
}
