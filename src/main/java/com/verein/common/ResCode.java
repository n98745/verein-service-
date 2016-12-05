package com.verein.common;

import com.verein.bean.res.Response;

/**
 * Created by LinYaoyao on 16/12/1.
 * 错误码 和 错误信息
 */
public enum ResCode {
    // 基本类型
    _000000("000000", "请求成功"),
    _000001("000001", "传入参数为空"),
    _000002("000002", "查无数据"),
    _000004("000004", "请求失败"),

    // 用户操作结果
    _USE001("USE001", "输入密码错误"),
    _USE002("USE002", "账号或密码为空"),
    _USE003("USE003", "用户不存在"),
    _USE004("USE004", "登陆成功"),
    _USE005("USE005", "登陆失败"),
    _USE006("USE006", "用户已存在"),
    _USE007("USE007", "注册成功"),
    _USE008("USE008", "新旧密码一致"),
    _USE009("USE009", "密码更改成功"),
    _USE010("USE010", "请先获取验证码"),

    // 操作数据库结果
    _DML001("DML001", "添加成功"),
    _DML002("DML002", "添加失败"),
    _DML003("DML003", "删除成功"),
    _DML004("DML004", "删除失败"),
    _DML005("DML005", "更改成功"),
    _DML006("DML006", "更改失败"),

    _999999("999999", "系统繁忙");

    private String code;  //交易响应码
    private String desc;  //响应码描述

    private ResCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return this.getCode() + ":" + this.getDesc();
    }
}
