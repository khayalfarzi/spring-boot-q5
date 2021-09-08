package az.company.springbootq5.dto;

import lombok.Data;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
@Data
public class Shape {
    public Object leng;
    public String length;
    public String area;
    public Object area1;
    public Object height;
}
