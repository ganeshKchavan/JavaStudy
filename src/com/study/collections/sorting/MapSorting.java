package com.study.collections.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

    public static void main(String args[]) {
        HashMap<Student, Result> studentResults = populateStudentResults();
        studentResults.forEach((k, v) -> System.out.println(k + " " + v));
        compareWithLambadaExpression(studentResults);
        compareWithMethodReference(studentResults);
    }

    private static void compareWithLambadaExpression(Map<Student, Result> studentResults) {
        System.out.println("== Sort using Lambada expressions ==");
        List<Map.Entry<Student, Result>> entries = studentResults.entrySet().stream()
                .sorted((a, b) -> b.getValue().getTotalMarks() - (a.getValue().getTotalMarks()) )
                .limit(4)
                .collect(Collectors.toList());
        entries.forEach(System.out::println);
    }

    private static void compareWithMethodReference(Map<Student, Result> studentResults) {
        System.out.println("== Sort using Method reference ==");
        List<Map.Entry<Student, Result>> entries = studentResults.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Result::compareByGradeAndTotalMarks))
                .limit(5)
                .collect(Collectors.toList());
        entries.forEach(System.out::println);
    }

    private static HashMap<Student, Result> populateStudentResults() {
        Student s1 = new Student(3, "Ganesh");
        Result r1 = new Result(88, "E");

        Student s2 = new Student(1, "Bhagyashri");
        Result r2 = new Result(95, "O");

        Student s3 = new Student(5, "Spruha");
        Result r3 = new Result(98, "O");

        Student s4 = new Student(2, "Umesh");
        Result r4 = new Result(90, "O");

        Student s5 = new Student(4, "Monika");
        Result r5 = new Result(83, "E");

        HashMap<Student, Result> studentResults = new HashMap<>();
        studentResults.put(s1, r1);
        studentResults.put(s2, r2);
        studentResults.put(s3, r3);
        studentResults.put(s4, r4);
        studentResults.put(s5, r5);

        return studentResults;
    }
}