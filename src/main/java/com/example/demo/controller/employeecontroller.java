package com.example.demo.controller;
import com.example.demo.model.employee;



//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/employee")
public class employeecontroller {

    //@GETMAPPING
    public String get_employee(){
        employee e=new employee(1,"sam");
        return e.getname();
    }

    //@POSTMAPPING
    public void set_employee(){
        employee e=new employee(1,"ram");
    }

}
