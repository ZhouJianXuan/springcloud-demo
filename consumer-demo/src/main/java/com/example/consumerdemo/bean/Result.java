package com.example.consumerdemo.bean;

import lombok.Data;

@Data
public class Result<T> {

    private String msg;

    private T data;

    public Result(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public Result(T data) {
        this.data = data;
    }
}
