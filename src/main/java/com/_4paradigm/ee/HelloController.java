package com._4paradigm.ee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello yiping_2";
    }

    //用fastjson出现中文乱码的话，记得加produces = "application/json; charset=utf-8"
    @RequestMapping(value = "/getDemo", produces = "application/json; charset=utf-8")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1000);
        demo.setName("张三和李四and王五");
        demo.setCreateTime(new Date());
        demo.setRemarks("这是一个备注信息");
        return demo;
    }
}
