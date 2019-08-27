package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TFans;


/**
*
*@author WangPeiren
*/
public interface TFansMapper {
    int deleteByPrimaryKey(Integer fansId);

    int insert(TFans record);

    int insertSelective(TFans record);

    TFans selectByPrimaryKey(Integer fansId);

    int updateByPrimaryKeySelective(TFans record);

    int updateByPrimaryKey(TFans record);
}