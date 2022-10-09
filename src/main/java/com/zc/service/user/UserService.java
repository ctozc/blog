package com.zc.service.user;

import com.zc.model.UserDomain;

import org.springframework.stereotype.Service;
@Service
public interface UserService {

    int updateUserInfo(UserDomain user);

    UserDomain getUserInfoById(Integer uId);


    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    UserDomain login(String username, String password);

}
