package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TAttention;


/**
*
*@author WangPeiren
*/
public interface TAttentionMapper {
    int deleteByPrimaryKey(Integer attentionId);

    int insert(TAttention record);

    int insertSelective(TAttention record);

    TAttention selectByPrimaryKey(Integer attentionId);

    int updateByPrimaryKeySelective(TAttention record);

    int updateByPrimaryKey(TAttention record);
}