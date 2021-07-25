package com.baidu.springboot.controller;

import com.baidu.springboot.bean.User;
import com.baidu.springboot.commons.CodeCommons;
import com.baidu.springboot.commons.Response;
import com.baidu.springboot.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "UserController", tags = "01 用户管理")
@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "1.1 根据id返回用户信息", notes = "根据id返回用户信息")
    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
    public Response kuang(Integer param){
        Response response = new Response();
        User user = userService.selectByPrimaryKey(param);
        if (user != null){
            response.setOk(CodeCommons.SUCCESS,user);
        }else {
            response.setError(CodeCommons.FAIL,CodeCommons.USER_ISNOTEXISTS);
        }
        return response;
    }


}
