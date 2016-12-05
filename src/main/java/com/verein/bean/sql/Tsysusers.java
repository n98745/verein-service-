package com.verein.bean.sql;

/**
 * Created by LinYaoyao on 16/12/2.
 */
public class Tsysusers {
    private String username;    // 账号
    private String password;    // 密码
    private String name;        // 用户名
    private String type;        // 类型  00-管理员  01-普通用户

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tsysusers{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
