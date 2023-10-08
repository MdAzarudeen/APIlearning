package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerLayer {
    @Autowired
    private ServiceLayer serviceLayer = new ServiceLayer();
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student)
    {
        return serviceLayer.addStudent(student);
    }
    @PostMapping("/addHod")
    public String addHod(@RequestBody Hod hod)
    {
        return serviceLayer.addHod(hod);
    }
    @PostMapping("/addGrant")
    public String addGrant(@RequestBody Grant grant)
    {
        return serviceLayer.addGrant(grant);
    }

    @GetMapping("/maxPassingStudentsBranch")
    public Branch passingStudents()
    {
        return serviceLayer.maxPassingStudentsBranch();
    }

    @GetMapping("/getHodContact")
    public long getHodContacts()
    {
        Branch br = serviceLayer.maxPassingStudentsBranch();
        return serviceLayer.contactNumber(br) ;
    }

    @GetMapping("/getGrantWithMaxPass")
    public int getGrantWithMaxPass()
    {
        Branch br = serviceLayer.maxPassingStudentsBranch();
        return serviceLayer.grantWithMaxPass(br) ;
    }

    @GetMapping("/studentsInRecentBranch")
    public List<Integer> studentsInRecentBranch()
    {
        Branch br = serviceLayer.recentBranch();
        return serviceLayer.studentsInRecentBranch(br);
    }
}
