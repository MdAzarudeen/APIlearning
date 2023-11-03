package com.example.backend;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositoryLayer {
    private Map<Integer, Student> studentMap = new HashMap<>();
    private Map<String, Hod> hodMap = new HashMap<>();
    private Map<Branch, Grant> grantMap = new HashMap<>();

    private Map<Branch, Integer> passingStudentsMap = new HashMap<>();

    public Map<Branch, Integer> getPassingStudentsMap() {
        return passingStudentsMap;
    }

    public void setPassingStudentsMap(Map<Branch, Integer> passingStudentsMap) {
        this.passingStudentsMap = passingStudentsMap;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Map<String, Hod> getHodMap() {
        return hodMap;
    }

    public void setHodMap(Map<String, Hod> hodMap) {
        this.hodMap = hodMap;
    }

    public Map<Branch, Grant> getGrantMap() {
        return grantMap;
    }

    public void setGrantMap(Map<Branch, Grant> grantMap) {
        this.grantMap = grantMap;
    }

    private Map<Integer, Lift> liftMap = new HashMap<>();
    private Map<Integer, Passenger> passengerMap = new HashMap<>();

    public Map<Integer, Lift> getLiftMap() {
        return liftMap;
    }

    public void setLiftMap(Map<Integer, Lift> liftMap) {
        this.liftMap = liftMap;
    }

    public Map<Integer, Passenger> getPassengerMap() {
        return passengerMap;
    }

    public void setPassengerMap(Map<Integer, Passenger> passengerMap) {
        this.passengerMap = passengerMap;
    }

}