package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
        /**
         * 登录
         * */
        List<User> login(@Param("User")User user);
        /**
         * 注册
         * */
        int regiter(@Param("User")User user);


}