package com.study.collections.sorting.map;

import com.study.collections.sorting.Result;
import com.study.collections.sorting.Student;

import java.util.Comparator;
import java.util.Map;

public class StudentNameAndIdComparator implements Comparator<Map.Entry<Student, Result>> {

    @Override
    public int compare(Map.Entry<Student, Result> entry1, Map.Entry<Student, Result> entry2) {
        int ret = entry1.getKey().getName().compareToIgnoreCase(entry2.getKey().getName());
        if(ret == 0) {
            return entry1.getKey().getId() - entry2.getKey().getId();
        }
        return ret;
    }
}
