package com.proseCommunity.www.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    /**
    * 文章id
    */
    private Integer articleId;

    /**
    * 文章标题
    */
    private String articleTitle;

    /**
    * 文章内容
    */
    private String articleContent;

    /**
    * 2级分类 默认为1
    */
    private Integer type2Id;

    /**
    * 喜欢数
    */
    private Integer likeNum;

    /**
    * 文章修改时间
    */
    private Date updateTime;

    /**
    * 点击数
    */
    private Integer clickNum;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 状态
    */
    private Integer status;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getType2Id() {
        return type2Id;
    }

    public void setType2Id(Integer type2Id) {
        this.type2Id = type2Id;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}