package com.example.backend;

public class Student {
    private String name;
    private int rollNo;
    private Branch branch;
    private int marks;

    public Student(String name, int rollNo, Branch branch, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
