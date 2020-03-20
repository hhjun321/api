package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /*1. hello world print*/
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString(){
        return "helloworld";
    }

    /*2. {message:"helloworld"} print */
    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson(){
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    /*3. hellowolrd.ftl files message print */
    @GetMapping(value = "/helloworld/page")
    public String helloworld(){
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello{
        private String message;
    }
}
