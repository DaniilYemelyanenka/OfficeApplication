package by.koronatech.office.core.service;

import by.koronatech.office.api.dto.GetDepartmentDTO;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    GetDepartmentDTO getDepartments();

}
