package pl.coderslab.resident.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
