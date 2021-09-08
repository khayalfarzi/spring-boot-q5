package az.company.springbootq5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootQ5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQ5Application.class, args);
    }
}