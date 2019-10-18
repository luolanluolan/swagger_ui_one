package com.origin.service;

import com.origin.entity.LoginInfoDto;

public interface UserLoginService {
    public LoginInfoDto selectUserById(Integer id);
    public void deleteUserById(Integer id);
}
