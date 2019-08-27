package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TArticle;


/**
*
*@author WangPeiren
*/
public interface TArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(TArticle record);

    int insertSelective(TArticle record);

    TArticle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(TArticle record);

    int updateByPrimaryKey(TArticle record);
}