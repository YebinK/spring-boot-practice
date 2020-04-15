package springboot.web;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("/")
    public String index() {
        //index.mustache 와 mapping
        return "index";
    }
}