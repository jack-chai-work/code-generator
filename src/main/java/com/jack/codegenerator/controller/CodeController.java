package com.jack.codegenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class CodeController {

    @RequestMapping("/test")
    public  String test(){
        return "test";
    }

}
