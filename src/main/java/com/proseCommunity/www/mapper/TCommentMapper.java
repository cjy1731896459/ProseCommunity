package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TComment;


/**
*
*@author WangPeiren
*/
public interface TCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(TComment record);

    int insertSelective(TComment record);

    TComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(TComment record);

    int updateByPrimaryKey(TComment record);
}