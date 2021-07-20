package com.baidu.springboot.controller;

import com.baidu.springboot.bean.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @ApiOperation("段耀威的接口")
    @PostMapping("/duan")
    public String kuang(@ApiParam("这个名字会被返回")String username){
        return username;
    }
}
