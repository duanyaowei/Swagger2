package com.baidu.springboot.commons;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("返回的实体类")
public class Response {
    @ApiModelProperty(value = "返回结果的状态码",name = "code")
    private int code;
    @ApiModelProperty(value = "返回结果的信息",name = "msg")
    private String msg;
    @ApiModelProperty(value = "返回结果的api",name = "api")
    private String api;
    @ApiModelProperty(value = "返回结果的具体数据",name = "data")
    private Object data;

    //单例
    public static Response getInstance(){
        return new Response();
    }

    //默认构造
    public Response(){}

    public Response setOk(CodeCommons codeCommons,Object data){
        this.code = codeCommons.getValue();
        this.msg = codeCommons.getMsg();
        this.data = data;
        return this;
    }

    public Response setError(CodeCommons codeCommons,Object data){
        this.code = codeCommons.getValue();
        this.msg = codeCommons.getMsg();
        return this;
    }
}
