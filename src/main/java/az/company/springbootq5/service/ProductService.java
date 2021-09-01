package az.company.springbootq5.service;

import az.company.springbootq5.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService extends CommonService<ProductDto, Long> {
}
