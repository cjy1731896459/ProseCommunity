package com.proseCommunity.www.mapper;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.vo.ArticleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {

    List<ArticleVo> findByAll(@Param("id")int id);
}
