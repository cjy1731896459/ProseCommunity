package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.TClickLike;


/**
*
*@author WangPeiren
*/
public interface TClickLikeMapper {
    int deleteByPrimaryKey(Integer clickLikeId);

    int insert(TClickLike record);

    int insertSelective(TClickLike record);

    TClickLike selectByPrimaryKey(Integer clickLikeId);

    int updateByPrimaryKeySelective(TClickLike record);

    int updateByPrimaryKey(TClickLike record);
}