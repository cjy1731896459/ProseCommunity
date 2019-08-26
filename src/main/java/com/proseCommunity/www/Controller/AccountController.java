package com.proseCommunity.www.Controller;

import com.proseCommunity.www.Service.Impl.AccountServiceImpl;
import com.proseCommunity.www.domain.entity.User;
import com.proseCommunity.www.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RequestMapping
@RestController
public class AccountController {
    @Resource
    AccountServiceImpl accountService;
    @Resource
    User user;
            /**
             * 登录
             * */
    @RequestMapping(value = "/login",params = {"username","password"})
    public Result<User> login(String username,String password){
        user.setUserName(username);
        user.setPassword(password);
        List<User> login = accountService.login(user);
            if (login!=null){
                return Result.success(login);
            }else {
                return Result.error();
        }
    }
        /**
         *注册
         * */
        @RequestMapping(value = "/register",params = {"username","password","sex","userimg","userdetails"})
        public Result<Integer> register(String username,String password,String sex,String userimg,String userdetails){
            user.setUserName(username);
            user.setPassword(password);
            int register = accountService.register(user);
            if (register==1){
                return Result.success("success");
                }else{ return Result.error();}
            }
        }
