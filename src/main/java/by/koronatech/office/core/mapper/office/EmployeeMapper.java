package by.koronatech.office.core.mapper.office;

import by.koronatech.office.api.dto.GetEmployeeDTO;
import by.koronatech.office.core.entity.Employee;
import by.koronatech.office.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapper.class)
public interface EmployeeMapper extends BaseMapper<Employee, GetEmployeeDTO> {
}
