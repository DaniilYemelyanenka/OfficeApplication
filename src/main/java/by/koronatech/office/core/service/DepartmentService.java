package by.koronatech.office.core.service;

import by.koronatech.office.api.dto.GetDepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {

   List<GetDepartmentDTO> getDepartments();

}
