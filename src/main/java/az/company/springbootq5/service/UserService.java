package az.company.springbootq5.service;

import az.company.springbootq5.dto.UserDto;
import az.company.springbootq5.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    void save(UserDto user);

    UserEntity get(Integer id);

    List<UserEntity> get();

    void update(UserDto user);

    void delete(Integer id);
}
