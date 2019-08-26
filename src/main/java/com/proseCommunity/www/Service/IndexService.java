package com.proseCommunity.www.Service;

import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.vo.ArticleVo;

import java.util.List;

public interface IndexService {
    /**
     * 查找所有文章
     * */
    List<ArticleVo> showAll();

    /**
     * 搜索框 模糊查询
     * */
    List<Article> search(String keyword);

}
