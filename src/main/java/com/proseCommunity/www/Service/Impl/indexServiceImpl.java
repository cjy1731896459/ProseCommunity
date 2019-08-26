package com.proseCommunity.www.Service.Impl;

import com.proseCommunity.www.Service.IndexService;
import com.proseCommunity.www.domain.entity.Article;
import com.proseCommunity.www.domain.vo.ArticleVo;
import com.proseCommunity.www.mapper.IndexMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class indexServiceImpl implements IndexService {
    @Resource
    IndexMapper indexMapper;

    /**
     * 首页展示*/
    @Override
    public List<ArticleVo> showAll() { return indexMapper.showAll(); }

    /**
     * 搜索框 模糊查询
     * */
    @Override
    public List<Article> search(String keyword){

    }
}
