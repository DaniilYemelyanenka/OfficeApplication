package by.koronatech.office.core.service.serviceImpl;


import by.koronatech.office.api.dto.GetDepartmentDTO;
import by.koronatech.office.core.entity.Department;
import by.koronatech.office.core.mapper.office.DepartmentMapper;
import by.koronatech.office.core.mapper.office.EmployeeMapper;
import by.koronatech.office.core.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentMapper departmentMapper;

    private final List<Department> departmentRepository = new ArrayList<>(
            List.of(
                    Department.builder().id(1l).name("HR").build(),
                    Department.builder().id(2L).name("accounting").build()
            )
    );

    @Override
    public List<GetDepartmentDTO> getDepartments() {

        return departmentMapper.toDtos(departmentRepository);
    }
}
