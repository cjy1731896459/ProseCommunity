package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TType1;


/**
*
*@author WangPeiren
*/
public interface TType1Mapper {
    int deleteByPrimaryKey(Integer type1Id);

    int insert(TType1 record);

    int insertSelective(TType1 record);

    TType1 selectByPrimaryKey(Integer type1Id);

    int updateByPrimaryKeySelective(TType1 record);

    int updateByPrimaryKey(TType1 record);
}