package com.example.backend;

public class Passenger {
    int id;
    int weight;
    int liftNo;

    public Passenger(int id, int weight, int liftNo) {
        this.id = id;
        this.weight = weight;
        this.liftNo = liftNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }
}
