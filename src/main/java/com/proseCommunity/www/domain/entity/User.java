package com.proseCommunity.www.domain.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 密码
    */
    private String password;

    /**
    * 头像
    */
    private String userImg;

    /**
    * 性别
    */
    private String userSex;

    /**
    * 个人介绍
    */
    private String userDetails;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 文章数
    */
    private Integer articleNum;

    /**
    * 关注数
    */
    private Integer attentionNum;

    /**
    * 粉丝数
    */
    private Integer fansNum;
    /**
     * 粉丝数
     */
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(Integer articleNum) {
        this.articleNum = articleNum;
    }

    public Integer getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }
}