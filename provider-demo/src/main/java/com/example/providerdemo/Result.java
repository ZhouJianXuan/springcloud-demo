package com.example.providerdemo;

public class Result<T> {

    private String msg;

    private T data;

    public Result(T data) {
        this.msg = "SUCCESS";
        this.data = data;
    }

    public Result(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
