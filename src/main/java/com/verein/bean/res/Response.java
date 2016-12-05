package com.verein.bean.res;

import com.verein.common.ResCode;

/**
 * Created by LinYaoyao on 16/12/1.
 * 请求接口 返回对象
 */
public class Response {
    private boolean isSuccess;
    // 成功时才返回该对象。
    private Object result;
    private String errorCode;
    private String errorMsg;

    public void setResponse(boolean isSuccess, Object result,  ResCode r) {
        this.isSuccess = isSuccess;
        this.result = result;
        if (r != null) {
            this.errorCode = r.getCode();
            this.errorMsg = r.getDesc();
        }
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "errorMsg='" + errorMsg + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", result=" + result +
                ", isSuccess=" + isSuccess +
                '}';
    }
}
