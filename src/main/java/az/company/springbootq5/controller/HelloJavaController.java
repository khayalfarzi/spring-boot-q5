package az.company.springbootq5.controller;

import az.company.springbootq5.model.Person;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloJavaController {

    private static final Map<String, String> MAP = new HashMap<>();

    @PostConstruct
    public void loadData() {
        MAP.put("1", "111");
        MAP.put("2", "222");
        MAP.put("3", "333");
        MAP.put("4", "444");
        MAP.put("5", "555");
        MAP.put("6", "666");
    }

    // localhost:2020/get/fin?fin=56
    @GetMapping("/get/fin")
    public String getInfoByFin(@RequestParam("fin") String fin) {
        return String.format("Your detail is : %s", MAP.get(fin));
    }

    // localhost:2020/post/56/34
    @PostMapping("/post/{key}/{v}")
    public void addInfo(@PathVariable("key") String key, @PathVariable("v") String value) {
        MAP.put(key, value);
    }

    @PutMapping("/put/{key}/{v}")
    public void updateInfo(@PathVariable("key") String key, @PathVariable("v") String value) {
        MAP.put(key, value);
    }

    @PatchMapping("/patch/{key}/{v}")
    public void updateInfoByPatch(@PathVariable("key") String key, @PathVariable("v") String value) {
        MAP.put(key, value);
    }

    @DeleteMapping("/delete/{key}")
    public void deleteInfo(@PathVariable("key") String key) {
        MAP.remove(key);
    }

    @PostMapping("/object")
    public String getObject(@RequestBody Person person) {
        System.out.println(person.toString());
        return person.toString();
    }
}