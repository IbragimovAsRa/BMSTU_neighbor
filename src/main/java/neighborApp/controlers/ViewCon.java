package neighborApp.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewCon {
    @GetMapping("/")
    public String app() {
        return "index.html";
    }
    @GetMapping("/homeapp")
    public String validate() {
        return "homeApp.html";
    }
}
