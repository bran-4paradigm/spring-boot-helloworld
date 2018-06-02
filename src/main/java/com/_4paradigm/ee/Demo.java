package com._4paradigm.ee;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class Demo {
    private int id;
    private String name;

    @JSONField(format="yyyy-MM-dd HH:mm")
    private Date createTime;

    //serialize = false 这样返回的json数据里面就看不到remarks字段了
    @JSONField(serialize = false)
    private String remarks;
}
