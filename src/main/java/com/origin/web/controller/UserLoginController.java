package com.origin.web.controller;

import com.origin.entity.LoginInfoDto;
import com.origin.service.UserLoginService;
import com.origin.web.api.UserLoginAPI;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserLoginController implements UserLoginAPI{

    @Resource
    private UserLoginService userLoginService;

    public LoginInfoDto selectUserById(Integer id){
        LoginInfoDto loginInfoDto = userLoginService.selectUserById(id);
        return loginInfoDto;
    }

    @GetMapping(value = API_SWAGGERUI+"/deleteUserById/{id}",name = "通过id删除1")
    @ResponseBody
    @ApiOperation(value = "通过id删除")
    public void deleteUserById(@PathVariable Integer id){
       userLoginService.deleteUserById(id);
    }

}
