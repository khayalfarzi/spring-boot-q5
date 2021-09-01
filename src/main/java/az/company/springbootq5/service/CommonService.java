package az.company.springbootq5.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommonService<T, ID> {

    void save(T t);

    T get(ID id);

    List<T> get();

    void update(T t);

    void delete(ID id);
}
