package com.example.thursday;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ResponseBody
    @GetMapping("/")
    public String index() {
        return "<h2> You made it ! 123 </h2>";
    }
}
