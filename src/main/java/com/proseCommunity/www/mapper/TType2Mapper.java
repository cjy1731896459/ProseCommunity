package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TType2;


/**
*
*@author WangPeiren
*/
public interface TType2Mapper {
    int deleteByPrimaryKey(Integer type2Id);

    int insert(TType2 record);

    int insertSelective(TType2 record);

    TType2 selectByPrimaryKey(Integer type2Id);

    int updateByPrimaryKeySelective(TType2 record);

    int updateByPrimaryKey(TType2 record);
}