package az.company.springbootq5.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
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

    @GetMapping("/get/fin/{fin}")
    public String getInfoByFin(@PathVariable("fin") String fin) {
        return String.format("Your detail is : %s", MAP.get(fin));
    }

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
}