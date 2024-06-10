package mr.buddies.projects.ScrutinyGlobal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Home {

    @RequestMapping("/welcome")
    public String welcome() {
        String text = "this is private page ";
        text+= " you allow for this users";
        return text;
    }


    @RequestMapping("/getusers")
    public String getUser() {
        return "{\"name\":\"Durgesh\"}";
    }

}
