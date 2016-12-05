package com.verein.bean.sys;

/**
 * Created by LinYaoyao on 16/12/2.
 */
public class LoginBean {
    private String username;    // 账号
    private String password;    // 密码(MD5加密)
    private String code;        // 加盐(验证码等)


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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
