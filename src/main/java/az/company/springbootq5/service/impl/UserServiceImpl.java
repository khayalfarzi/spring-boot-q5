package az.company.springbootq5.service.impl;

import az.company.springbootq5.dto.UserDto;
import az.company.springbootq5.model.Education;
import az.company.springbootq5.model.Product;
import az.company.springbootq5.model.UserEntity;
import az.company.springbootq5.repository.EducationRepository;
import az.company.springbootq5.repository.ProductRepository;
import az.company.springbootq5.repository.UserRepository;
import az.company.springbootq5.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final ProductRepository productRepository;
    private final EducationRepository educationRepository;

    public UserServiceImpl(UserRepository repository,
                           ProductRepository productRepository,
                           EducationRepository educationRepository) {
        this.repository = repository;
        this.productRepository = productRepository;
        this.educationRepository = educationRepository;
    }

    @Override
    public void save(UserDto user) {
        UserEntity userEntityE = new UserEntity();
        getUserEntity(user, userEntityE);
        repository.save(userEntityE);
    }

    private void getUserEntity(UserDto user, UserEntity userEntityE) {
        userEntityE.setName(user.getName());
        userEntityE.setGender(user.getGender());

        Education education = educationRepository.findById(user.getEducation().getId())
                .orElseThrow(() -> new RuntimeException("Education id not found"));
        userEntityE.setEducation(education);

        List<Product> products =
                user.getProducts().stream()
                        .map(u -> productRepository.findById(u.getId())
                                .orElseThrow(() -> new RuntimeException("Education id not found")))
                        .collect(Collectors.toList());
        userEntityE.setProducts(products);

    }

    // write new method for fill dto to entity

    @Override
    public UserEntity get(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<UserEntity> get() {
        return repository.findAll();
    }

    @Override
    public void update(UserDto user) {
        UserEntity userEntityE = repository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User id not found"));
        getUserEntity(user, userEntityE);

        repository.save(userEntityE);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
