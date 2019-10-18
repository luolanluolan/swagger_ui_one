package com.origin.dao;

import com.origin.entity.LoginInfoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginDao {
    public LoginInfoDto selectUserById(Integer id);
    public void deleteUserById(Integer id);
}
