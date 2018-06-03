package com._4paradigm.ee.mapper;

import com._4paradigm.ee.Demo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DemoMapper {

    //#{name}: 参数占位符
    @Select("select * from Demo where name = #{name}")
    public List<Demo> likeName(String name);

    @Select("select * from Demo where id = #{id}")
    public Demo getById(long id);

    @Select("select name from Demo where id = #{id}")
    public String getNameById(long id);
}
