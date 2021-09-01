package az.company.springbootq5.controller;

import az.company.springbootq5.dto.EducationDto;
import az.company.springbootq5.service.EducationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education")
public class EducationController {

    private final EducationService service;

    public EducationController(EducationService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void save(@RequestBody EducationDto educationDto) {
        service.save(educationDto);
    }
}
