package com.teddy_pear.four;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/four-0.0.1-SNAPSHOT/test")
    public String get(){
        return "test";
    }
}
