package com.proseCommunity.www.www.Controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/index/v1")
public class IndexController {

    @Resource
    indexServiceImpl indexService;
    /**
     * 主页
     * 导航图
     * 菜单
     * 轮播图
     * */
    @RequestMapping(value = "/head",produces={"text/html;charset=utf-8"})
    public Result<CateBean> loadingHead(){
        CateBean head = indexService.getHead();
        try {
            return Result.success(head);
        }catch (Exception e){
            log.debug(e.getMessage());
        }
        return Result.error();
    }
    /**
     * 模糊查询
     * */
    @RequestMapping(value = "/select",produces={"text/html;charset=utf-8"})

    }
    /**
     * 展示全部商品
     * */
    @RequestMapping(value = "/showAll",produces={"text/html;charset=utf-8"})

    }
    /**
     * 页数
     * */


}
