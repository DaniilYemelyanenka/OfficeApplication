package by.koronatech.office.api.controller;

import by.koronatech.office.api.dto.CreateEmployeeDTO;
import by.koronatech.office.api.dto.GetEmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{department}")
    public GetEmployeeDTO getEmployeesByDepartment(@PathVariable String department){
        return new GetEmployeeDTO(null,null,null,null,null);
    }

    @PostMapping("/{department}")
    public void addEmployeeToDepartment(@PathVariable String department, @RequestParam CreateEmployeeDTO createEmployeeDTO){

    }
    @PatchMapping("/{id}")
    public void addToEmployeeManagerStatus(@PathVariable long id){
    }

    @PatchMapping("/update{id}")
    public void updateEmployeeInformation(@PathVariable long id, @RequestParam CreateEmployeeDTO createEmployeeDTO){
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeFromDepartment(@PathVariable long id){
    }
}
