package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String my(){
        System.out.println("==========---=========");
        return "This is Test";
    }
}
