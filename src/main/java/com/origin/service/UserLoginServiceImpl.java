package com.origin.service;

import com.origin.dao.UserLoginDao;
import com.origin.entity.LoginInfoDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Resource
    private UserLoginDao userLoginDao;

    @Override
    public LoginInfoDto selectUserById(Integer id){
        LoginInfoDto loginInfoDto = userLoginDao.selectUserById(id);
        return loginInfoDto;
    }

    @Override
    public void deleteUserById(Integer id){
        userLoginDao.deleteUserById(id);
    }

}
