package com.study.collections.sorting;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.id % Integer.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student otherStudent = (Student) obj;
            if(this.id == otherStudent.id
                && this.name == otherStudent.name) {
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Student[id=%d, name=%s]", this.id, this.name);
    }
}
