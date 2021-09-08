package az.company.springbootq5.client;

import az.company.springbootq5.dto.Root;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
public class OpenDataClient {

    private static final String URI = "https://api.opendata.az/v1/json/map/lakes/1";

//    @PostConstruct
    public static void load() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Root> responseEntity = restTemplate
                .exchange(URI, HttpMethod.GET, entity, Root.class);

        System.out.println(responseEntity.getBody());
    }
}
