package com.vs.demo;

import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用一句话描述
 *
 * @author chaoge666
 * 2017/10/10 10:28
 **/
@RestController
public class Action {
    @PostMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/cs")

    public String cs(){
        return "hello";
    }
}
