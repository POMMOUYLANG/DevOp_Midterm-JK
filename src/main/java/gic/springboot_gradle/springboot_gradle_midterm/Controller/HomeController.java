package gic.springboot_gradle.springboot_gradle_midterm.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hello Everingone";
    }
    
}
