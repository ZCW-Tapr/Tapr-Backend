package rocks.zipcode.Tapr.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/get")
    public String greeting() {
        return "Hello and welcome to TAPR!";
    }

    @GetMapping("/put")
    public String put() {
        return "Updated User";
    }
    @GetMapping("/post")
    public String post() {
        return "Added User";
    }

    @GetMapping("/delete")
    public String delete() {
        return "Deleted User";
    }

}
