package by.koronatech.office.core.service.serviceImpl;

import by.koronatech.office.api.dto.CreateEmployeeDTO;
import by.koronatech.office.api.dto.GetEmployeeDTO;
import by.koronatech.office.core.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<GetEmployeeDTO> findEmployeeByDepartment(String department) {
        return List.of();
    }

    @Override
    public GetEmployeeDTO addEmployeeToDepartment(CreateEmployeeDTO createEmployeeDTO) {
        return null;
    }

    @Override
    public GetEmployeeDTO addToEmployeeManagerStatus(long id) {
        return null;
    }

    @Override
    public GetEmployeeDTO updateEmployeeInformation(CreateEmployeeDTO createEmployeeDTO) {
        return null;
    }

    @Override
    public GetEmployeeDTO deleteEmployee(long id) {
        return null;
    }
}
