package com.baidu.springboot.dao;

import com.baidu.springboot.bean.User;

public interface UserMapper {

    //根据id查询用户信息
    User selectByPrimaryKey(Integer id);

}