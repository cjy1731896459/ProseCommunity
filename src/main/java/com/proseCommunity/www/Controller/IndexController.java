package com.proseCommunity.www.Controller;

import com.proseCommunity.www.Service.IndexService;
import com.proseCommunity.www.domain.vo.ArticleVo;
import com.proseCommunity.www.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping
@Slf4j
@RestController
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping(value = "/showAll")
    public Result<List<ArticleVo>> showAll(){
        List<ArticleVo> articleVos = indexService.showAll();
        if (articleVos!=null){
            return Result.success(articleVos);
        }else {
            return Result.error();
        }
    }

}
