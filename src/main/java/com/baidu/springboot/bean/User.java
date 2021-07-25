package com.baidu.springboot.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty(value = "主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "用户名",name = "username")
    private String username;
    @ApiModelProperty(value = "用户密码",name = "loginpassword")
    private String password;
    @ApiModelProperty(value = "用户邮箱",name = "email")
    private String email;
    @ApiModelProperty(value = "tocken",name = "tocken")
    private String tocken;


}