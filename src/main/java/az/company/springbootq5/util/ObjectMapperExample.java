package az.company.springbootq5.util;

import az.company.springbootq5.model.Person;
import az.company.springbootq5.model.constant.Gender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ObjectMapperExample {

    //    Generated Person object: Person{id=1, name='Name', surname='Surname', age=11, gender=MALE, fatherName='Father Name', motherName='Mother Name'}
//    @PostConstruct
    public void generateObject() throws Exception {
        String json = "{\"id\":1,\"name\":\"Name\",\"surname\":\"Surname\",\"age\":11,\"gender\":\"MALE\",\"fatherName\":\"Father Name\",\"motherName\":\"Mother Name\"}";
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);

        System.out.printf("Generated Person object: %s", person);
    }

    //    @PostConstruct
    public void generateJson() throws JsonProcessingException {

        Person person = getPersonObject();

        ObjectMapper mapper = new ObjectMapper();
        String generatedJson = mapper.writeValueAsString(person);

        System.out.printf("Json is : %s", generatedJson);
    }

    public Person getPersonObject() {
        return Person.builder()
                .name("Ismayil")
                .age(26)
                .fatherName("Ismayil")
                .id(1111)
                .gender(Gender.MALE)
                .build();
    }
}