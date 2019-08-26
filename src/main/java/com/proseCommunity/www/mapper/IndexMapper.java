package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.entity.User;
import com.proseCommunity.www.domain.vo.ArticleVo;
import com.proseCommunity.www.domain.vo.UserVo;

import java.util.List;

public interface IndexMapper {

    /**
     * 展示所有文章
     * */
    List<ArticleVo>showAll();

    /**
     * 首页用户展示
     * */
    /*List<UserVo> showUser();*/

    /**
     * 搜索框 文章模糊查询
     * */
    List<Article> searchArticle(String keyword);
    /**
     * 搜索框 用户模糊查询
     * */
    List<User> searchUser(String keyword);

}