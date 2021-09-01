package az.company.springbootq5.dto;

import az.company.springbootq5.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer id;

    private String name;

    private Gender gender;

    private EducationDto education;

    private List<ProductDto> products;
}