package net.proselyte.jwtappdemo.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String app() {
        return "index.html";
    }
    @GetMapping("/homeapp")
    public String validate() {
        return "homeApp.html";
    }
}