package com.proseCommunity.www.Service.Impl;

import com.proseCommunity.www.Service.AccountService;
import com.proseCommunity.www.domain.entity.User;
import com.proseCommunity.www.mapper.UserMapper;
import com.proseCommunity.www.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    UserMapper userMapper;
    /**
    *登录
     */

    @Override
    public List<User> login(User user) {
        List<User> users = userMapper.login(user);
        if (users!=null){
            if (user.getPassword()==users.get(0).getPassword()){
                return users;
            }else {return null;}
        }else {
                   return null;
        }
    }

    @Override
    public int register(User user) { return userMapper.regiter(user); }
}
