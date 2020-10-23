package com.bjsxt.gitdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @RequestMapping("/{page}")
    public String demo(@PathVariable String page){
        return page;
    }
}
