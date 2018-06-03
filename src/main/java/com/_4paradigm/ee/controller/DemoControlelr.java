package com._4paradigm.ee.controller;

import com._4paradigm.ee.Demo;
import com._4paradigm.ee.service.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoControlelr {


    @Autowired
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        /*
        * 第一个参数：第几页，第二个参数：每页的条数
         */
        PageHelper.startPage(1, 6);
        return demoService.likeName(name);
    }

    @RequestMapping("/save")
    public Demo save(){
        Demo demo = new Demo();
        demo.setName("李四");
        demoService.save(demo);
        return demo;
    }

}
