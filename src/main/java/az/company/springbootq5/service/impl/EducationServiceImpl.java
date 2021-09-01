package az.company.springbootq5.service.impl;

import az.company.springbootq5.dto.EducationDto;
import az.company.springbootq5.model.Education;
import az.company.springbootq5.repository.EducationRepository;
import az.company.springbootq5.service.EducationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    private final EducationRepository repository;

    public EducationServiceImpl(EducationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(EducationDto educationDto) {
        Education education = Education.builder()
                .name(educationDto.getName())
                .level(educationDto.getLevel())
                .build();

        repository.save(education);
    }

    @Override
    public EducationDto get(Integer integer) {
        return null;
    }

    @Override
    public List<EducationDto> get() {
        return null;
    }

    @Override
    public void update(EducationDto educationDto) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
