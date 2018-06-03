package com._4paradigm.ee.service;

import com._4paradigm.ee.Demo;
import com._4paradigm.ee.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

    @Transactional //添加事务
    public void save(Demo demo){
        demoMapper.save(demo);
    }

}
