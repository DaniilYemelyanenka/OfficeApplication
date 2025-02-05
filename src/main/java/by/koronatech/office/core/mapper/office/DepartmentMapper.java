package by.koronatech.office.core.mapper.office;

import by.koronatech.office.api.dto.GetDepartmentDTO;
import by.koronatech.office.core.entity.Department;
import by.koronatech.office.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapper.class)
public interface DepartmentMapper extends BaseMapper<Department, GetDepartmentDTO> {
}
