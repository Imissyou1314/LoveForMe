package com.miss.imissyou.loveforme.bean;

/**
 * 用户信息
 * Created by Imissyou on 2016/9/7.
 */
public class User {

    /** 用户Id*/
    Long Id;

    /** 用户名*/
    String userName;

    /** 用户密码*/
    String password;

    /** 用户账号*/
    String accout;

    /** 用户创建时间*/
    String createTime;

    /** 用户手机号*/
    String phoneNumber;

    /** 用户状态*/
    Boolean status;

    /** 用户的手机UUID*/
    String phoneMmid;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPhoneMmid() {
        return phoneMmid;
    }

    public void setPhoneMmid(String phoneMmid) {
        this.phoneMmid = phoneMmid;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accout='" + accout + '\'' +
                ", createTime='" + createTime + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status +
                ", phoneMmid='" + phoneMmid + '\'' +
                '}';
    }
}
