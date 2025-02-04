package by.koronatech.office.core.service;

import by.koronatech.office.api.dto.CreateEmployeeDTO;
import by.koronatech.office.api.dto.GetEmployeeDTO;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<GetEmployeeDTO>  findEmployeeByDepartment(String department);

    GetEmployeeDTO addEmployeeToDepartment(CreateEmployeeDTO createEmployeeDTO);

    GetEmployeeDTO addToEmployeeManagerStatus(long id);

    GetEmployeeDTO updateEmployeeInformation(CreateEmployeeDTO createEmployeeDTO);

    GetEmployeeDTO deleteEmployee(long id);
}
