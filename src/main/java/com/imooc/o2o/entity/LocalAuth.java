package com.imooc.o2o.entity;

import java.util.Date;

public class LocalAuth {

    private Long LocalAuthId;           //微信id
    private String username;            //账户
    private String password;            //密码
    private Date createTime;            //创建时间
    private Date lastEditTime;          //修改时间
    private PersonInfo personInfo;      //用户信息

    public Long getLocalAuthId() {
        return LocalAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        LocalAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
