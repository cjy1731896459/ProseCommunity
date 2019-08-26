package com.proseCommunity.www.Service;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.vo.ArticleVo;

import java.util.List;

public interface ArticleService {
    List<ArticleVo> findById(int id);
}
