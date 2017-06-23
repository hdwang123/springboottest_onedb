package com.hdwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hdwang on 2017/6/6.
 */
@Controller
@RequestMapping("/test2")
public class Test2 {

    @RequestMapping("")
    public String index(){
        return "test";
    }

    @RequestMapping("/throwex")
    @ResponseBody
    public String throwex(){
        int a = 3;
        int b=0;
        return String.valueOf(a/b);
    }
}
