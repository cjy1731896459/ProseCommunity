package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.vo.ArticleVo;

import java.util.List;

public interface IndexMapper {

    /**
     * 展示所有文章
     * */
    List<ArticleVo> showAll();
}