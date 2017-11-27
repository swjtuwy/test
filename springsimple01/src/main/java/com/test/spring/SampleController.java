package com.test.spring;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 * Created by test on 6/27/17.
 */

@Controller
@SpringBootApplication
public class SampleController {

    @ResponseBody
    @RequestMapping(value = "/")
    String home(){
        return "hello world";
    }

    public static void main(String[] args) throws  Exception{
        SpringApplication.run(SampleController.class, args);
    }
}
