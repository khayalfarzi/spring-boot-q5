package az.company.springbootq5.client;

import az.company.springbootq5.dto.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "open-data-api", url = "https://api.opendata.az/")
public interface OpenDataFeignClient {

    @GetMapping(value = "/v1/json/map/lakes/{id}")
    Root getLakeById(@PathVariable("id") Long id);
}