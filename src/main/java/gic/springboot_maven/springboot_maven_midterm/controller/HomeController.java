package gic.springboot_maven.springboot_maven_midterm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hello World";
    }
    
}
