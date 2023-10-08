package com.example.backend;

public class Hod {
    private Branch branch;
    private String hodName;
    private long contact;

    public Hod(Branch branch, String hodName, long contact) {
        this.branch = branch;
        this.hodName = hodName;
        this.contact = contact;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
