package com.example.consumerdemo.bean;

import lombok.Data;

@Data
public class ResultBig<T> {

    private String msg;

    private T data;

    private String head;

    public ResultBig(String msg, T data, String head) {
        this.msg = msg;
        this.data = data;
        this.head = head;
    }

    public ResultBig(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public ResultBig(String head, Result<T> result) {
        this.head = head;
        this.msg = result.getMsg();
        this.data = result.getData();
    }
}
