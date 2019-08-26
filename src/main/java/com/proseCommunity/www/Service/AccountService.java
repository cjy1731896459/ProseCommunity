package com.proseCommunity.www.Service;

import com.proseCommunity.www.domain.entity.User;

import java.util.List;

public interface AccountService {
    /**
     * 登录
     * */
    List<User> login(User user);
    /**
     * 注册
     * */
    int register(User user);
}
