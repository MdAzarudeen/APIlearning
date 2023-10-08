package com.example.backend;

public class Grant {
    private Branch branch;
    private int grant;
    private int year;

    public Grant(Branch branch, int grant, int year) {
        this.branch = branch;
        this.grant = grant;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }
}
