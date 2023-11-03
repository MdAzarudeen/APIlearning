package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addLift")
    public String addLift(@RequestBody Lift lift)
    {
        return serviceLayer.addLift(lift);
    }

    @PostMapping("/addPassenger")
    public String addPassenger(@RequestBody Passenger passenger)
    {
        return serviceLayer.addPasseneger(passenger);
    }

    @GetMapping("/passengerList")
    public List<Integer> showPassengers()
    {
        return serviceLayer.showPassengers();
    }

    @GetMapping("/deletePassengers")
    public List<Integer> deletePassengers()
    {
        return serviceLayer.deletePassengers();
    }

    @GetMapping("/pplWithXwt/{x}")
    public int pplWithXweight(@PathVariable ("x")int x){
        return serviceLayer.pplWithXweight(x);
    }
}
