package com.example.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceLayer {

    @Autowired
    private RepositoryLayer repositoryLayer = new RepositoryLayer();

    public String addStudent(Student student)
    {
        Map<Integer,Student> map = repositoryLayer.getStudentMap();
        map.put(student.getRollNo(),student);
        return "Student has been added successfully";
    }

    public String addHod(Hod hod)
    {
        Map<String,Hod> hodMap = repositoryLayer.getHodMap();
        hodMap.put(hod.getHodName(),hod);
        return "HOD has been added successfully";
    }

    public String addGrant(Grant grant)
    {
        Map<Branch,Grant> grantMap = repositoryLayer.getGrantMap();
        grantMap.put(grant.getBranch(),grant);
        return "Grant has been added successfully";
    }

    public Branch maxPassingStudentsBranch()
    {
        Map<Branch,Integer> passingStudentsMap = new HashMap<>();
        Map<Integer,Student> map = repositoryLayer.getStudentMap();
        for (Student student : map.values() )
        {
            if(student.getMarks()>=40)
                passingStudentsMap.put(student.getBranch(),passingStudentsMap.getOrDefault(student.getBranch(),0)+1);
        }
        int maxPass =0;
        Branch branch = Branch.BT;
        for(Branch br : passingStudentsMap.keySet())
        {
            if(passingStudentsMap.get(br)>maxPass)
                {
                    maxPass = passingStudentsMap.get(br);
                    branch = br;
                }
        }
        return branch;
    }

    public long contactNumber(Branch br)
    {
        long ans = 0;
        Map<String,Hod> hodMap = repositoryLayer.getHodMap();
        for(Hod hod : hodMap.values())
        {
            if(hod.getBranch()==br)
                ans = hod.getContact();
        }
        return ans;
    }

    public int grantWithMaxPass(Branch br)
    {
        int ans =0;
        Map<Branch,Grant> grantMap = repositoryLayer.getGrantMap();
        for(Grant grant: grantMap.values())
        {
            if(grant.getBranch()==br)
                ans = grant.getGrant();
        }
        return ans;
    }

    public Branch recentBranch()
    {
        Branch branch = Branch.BT;
        int ans = Integer.MIN_VALUE;
        Map<Branch,Grant> grantMap = repositoryLayer.getGrantMap();
        for(Grant grant: grantMap.values())
        {
            if(grant.getYear()>ans)
            {
                ans = grant.getYear();
                branch = grant.getBranch();
            }
        }
        return branch;
    }
    public List<Integer> studentsInRecentBranch(Branch branch)
    {
        List<Integer> roll = new ArrayList<>();
        Map<Integer,Student> map = repositoryLayer.getStudentMap();
        for (Student student : map.values() )
        {
            if (student.getBranch() == branch){
                roll.add(student.getRollNo());
            }
        }
        return roll;
    }
}
