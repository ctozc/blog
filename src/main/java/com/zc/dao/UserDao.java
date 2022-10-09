package com.zc.dao;

import com.zc.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    int updateUserInfo(UserDomain user);

    UserDomain getUserInfoById(@Param("uid") Integer uId);

    UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);
}
