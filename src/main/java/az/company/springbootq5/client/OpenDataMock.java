package az.company.springbootq5.client;

import az.company.springbootq5.dto.Root;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OpenDataMock {

    private final OpenDataFeignClient client;

    public OpenDataMock(OpenDataFeignClient client) {
        this.client = client;
    }

    @PostConstruct
    public void mock() {
        Root root = client.getLakeById(1L);
        System.out.println(root);
    }
}
