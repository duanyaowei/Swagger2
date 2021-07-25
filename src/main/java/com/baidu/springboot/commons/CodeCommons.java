package com.baidu.springboot.commons;

/**
 * 自定义枚举类
 */
public enum  CodeCommons {

    SUCCESS("成功",1),
    FAIL("失败",0),
    USER_ISNOTEXISTS("用户不存在",2);

    private Integer value;
    private String msg;

    CodeCommons(String msg,Integer value){
        this.msg = msg;
        this.value = value;
    }

    public String getMsg(){
        return msg;
    }

    public Integer getValue(){
        return value;
    }
}
