package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TCollect;


/**
*
*@author WangPeiren
*/
public interface TCollectMapper {
    int deleteByPrimaryKey(Integer collectId);

    int insert(TCollect record);

    int insertSelective(TCollect record);

    TCollect selectByPrimaryKey(Integer collectId);

    int updateByPrimaryKeySelective(TCollect record);

    int updateByPrimaryKey(TCollect record);
}