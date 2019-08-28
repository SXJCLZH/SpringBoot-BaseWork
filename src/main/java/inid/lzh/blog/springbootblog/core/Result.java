package inid.lzh.blog.springbootblog.core;

import com.alibaba.fastjson.JSON;

/**
 * 统一API响应结果封装
 */
public class Result<T> {
    private int code;
    private String message;
    private boolean callbackflage;
    private T data;

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isCallbackflage() {
        return callbackflage;
    }

    public Result setCallbackflage(boolean callbackflage) {
        this.callbackflage = callbackflage;
        return  this ;
    }

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
