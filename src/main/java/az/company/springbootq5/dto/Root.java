package az.company.springbootq5.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
public class Root{
    @JsonProperty("Status")
    public String status;
    @JsonProperty("StatusMessage")
    public Object statusMessage;
    @JsonProperty("Response")
    public Response response;


}

