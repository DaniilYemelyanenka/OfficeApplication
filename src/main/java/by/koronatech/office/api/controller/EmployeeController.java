package by.koronatech.office.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{department}")
    public String getEmployeesByDepartment(@PathVariable String department){
        return "";
    }

    @PostMapping("/{department}")
    public String addEmployeeToDepartment(@PathVariable String department,@RequestParam String employee){
        return "";
    }
    @PatchMapping("/{id}")
    public String addToEmployeeManagerStatus(@RequestParam String employee){
        return "";
    }

    @PatchMapping("/{id}")
    public String updateEmployeeInformation(@PathVariable String id, @RequestParam String employee){
        return "";
    }

    @DeleteMapping("/{department}")
    public String deleteEmployeeFromDepartment(@PathVariable String department, @RequestParam String employee){
        return "";
    }
}
