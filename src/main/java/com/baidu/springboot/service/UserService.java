package com.baidu.springboot.service;

import com.baidu.springboot.bean.User;

public interface UserService {

    User selectByPrimaryKey(Integer id);
}
