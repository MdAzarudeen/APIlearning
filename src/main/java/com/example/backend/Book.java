package com.example.backend;

public class Book {
    private String name;
    private String authorName;
    private int noOfPages;


    public Book(String name, String authorName, int noOfPages) {
        this.name = name;
        this.authorName = authorName;
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
