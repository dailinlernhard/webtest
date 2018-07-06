package com.aixin.tuna.webtest.baseauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dailin on 2018/6/13.
 */
@Controller
@RequestMapping(value = "")
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/test1")
    public String test1(){
        return "test/test1";
    }
}
