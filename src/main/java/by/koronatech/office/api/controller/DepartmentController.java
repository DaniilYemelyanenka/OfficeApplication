package by.koronatech.office.api.controller;


import by.koronatech.office.api.dto.GetDepartmentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping
    public GetDepartmentDTO getDepartments(){
        return new GetDepartmentDTO(null,null);
    }
}
