package az.company.springbootq5.controller;

import az.company.springbootq5.dto.ProductDto;
import az.company.springbootq5.model.Product;
import az.company.springbootq5.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void save(@RequestBody ProductDto product) {
        service.save(product);
    }
}
