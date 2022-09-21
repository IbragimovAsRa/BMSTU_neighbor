package neighborApp.controlers;

import org.apache.catalina.users.GenericRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCon {
    @GetMapping("/get")
    public String rest() {
        String str = "{\"name\":\"Иван\",\"age\":25}";
        return str;
    }
    @PostMapping("/validate")
    public void resct() {
        String str = "{\"name\":\"Иван\",\"age\":25}";
    }
}
