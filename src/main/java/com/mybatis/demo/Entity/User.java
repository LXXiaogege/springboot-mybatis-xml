package com.mybatis.demo.Entity;

import com.mybatis.demo.enums.UserSex;

import java.io.Serializable;

/**
 * @author lvixn
 * @date 2018/11/27 19:26
 */
public class User implements Serializable {

    private Long id;
    private String userName;
    private String passWord;
    private UserSex userSex;
    private String nickName;


    public User(Long id, String userName, String passWord, UserSex userSex, String nickName) {

        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserSex getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSex userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
    }
}
