package az.company.springbootq5.service.impl;

import az.company.springbootq5.repository.HelloJavaRepository;
import az.company.springbootq5.service.HelloJavaService;
import org.springframework.stereotype.Service;

@Service
public class HelloJavaServiceImpl implements HelloJavaService {

    private final HelloJavaRepository repository;

    public HelloJavaServiceImpl(HelloJavaRepository repository) {
        this.repository = repository;
    }
}
