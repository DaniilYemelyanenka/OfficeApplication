package by.koronatech.office.core.service.serviceImpl;

import by.koronatech.office.api.dto.CreateEmployeeDTO;
import by.koronatech.office.api.dto.GetEmployeeDTO;
import by.koronatech.office.core.entity.Employee;
import by.koronatech.office.core.mapper.office.CreateEmployeeMapper;
import by.koronatech.office.core.mapper.office.EmployeeMapper;
import by.koronatech.office.core.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeRepository = new ArrayList<>(
            List.of(
                    Employee.builder().id(1L).department("HR").name("John").manager(false).build(),
                    Employee.builder().id(2L).department("accounting").name("Ivan").manager(true).build()
            )
    );

    private EmployeeMapper employeeMapper;
    private CreateEmployeeMapper createEmployeeMapper;

    @Override
    public List<GetEmployeeDTO> findEmployeeByDepartment(String department) {
        return employeeMapper.toDtos(employeeRepository.stream().filter(employee -> employee.getDepartment().equals(department)).toList());
    }

    @Override
    public GetEmployeeDTO addEmployeeToDepartment(CreateEmployeeDTO createEmployeeDTO) {
        employeeRepository.add(createEmployeeMapper.toEntity(createEmployeeDTO));
        return employeeMapper.toDto(createEmployeeMapper.toEntity(createEmployeeDTO));
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

    public GetEmployeeDTO findById(long id){
        return employeeMapper.toDto(employeeRepository
                .stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .get());
    }
}
