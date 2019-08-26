package com.proseCommunity.www.utils;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class VagueList {
    /**
     * 模糊查询用户
     * */
    List<User> users;
    /**
     * 模糊查询文章
     * */
    List<Article> articles;


}
