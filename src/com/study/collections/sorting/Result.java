package com.study.collections.sorting;

class Result {
    private int totalMarks;
    private String grade;

    public Result(int totalMarks, String grade) {
        this.totalMarks = totalMarks;
        this.grade = grade;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static int compareByGradeAndTotalMarks(Result r1, Result r2) {
        int ret = r1.getGrade().compareToIgnoreCase(r2.getGrade());
        if(ret != 0) {
            return ret;
        }
        return r1.getTotalMarks() - r2.getTotalMarks();
    }

    public String toString() {
        return String.format("Result[TotalMarks=%d, Grade=%s]", this.totalMarks, this.grade);
    }
}