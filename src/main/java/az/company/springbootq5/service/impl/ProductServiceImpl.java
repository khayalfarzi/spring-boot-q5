package az.company.springbootq5.service.impl;

import az.company.springbootq5.dto.ProductDto;
import az.company.springbootq5.model.Product;
import az.company.springbootq5.repository.ProductRepository;
import az.company.springbootq5.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(ProductDto productDto) {

        Product product = Product.builder()
                .name(productDto.getName())
                .price(productDto.getPrice())
                .build();

        repository.save(product);
    }

    @Override
    public ProductDto get(Long aLong) {
        return null;
    }

    @Override
    public List<ProductDto> get() {
        return null;
    }

    @Override
    public void update(ProductDto productDto) {

    }

    @Override
    public void delete(Long aLong) {

    }
}
