package com.teddy_pear.four;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String first() {
        return "test";
    }

    @RequestMapping("/test")
    public String get(){
        return "test";
    }
}
