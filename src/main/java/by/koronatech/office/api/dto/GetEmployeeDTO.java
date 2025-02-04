package by.koronatech.office.api.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeDTO {

    private Long id;

    private String name;

    private Double salary;

    private String department;

    private Boolean manager;

}
