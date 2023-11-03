package com.example.backend;

public class Lift {
    int liftNo;
    int capInWt;
    int capInPerson;
//    List<Passenger>;

    public Lift(int liftNo, int capInWt, int capInPerson) {
        this.liftNo = liftNo;
        this.capInWt = capInWt;
        this.capInPerson = capInPerson;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapInWt() {
        return capInWt;
    }

    public void setCapInWt(int capInWt) {
        this.capInWt = capInWt;
    }

    public int getCapInPerson() {
        return capInPerson;
    }

    public void setCapInPerson(int capInPerson) {
        this.capInPerson = capInPerson;
    }
}
