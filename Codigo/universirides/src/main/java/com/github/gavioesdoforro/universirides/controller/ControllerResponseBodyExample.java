package com.github.gavioesdoforro.universirides.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerResponseBodyExample {

    @RequestMapping("/helloresponsebody")
    @ResponseBody
    String helloResponseBody() {
        return("Hello World. This is produced by a method annotated with ResponseBody");
    }
}
