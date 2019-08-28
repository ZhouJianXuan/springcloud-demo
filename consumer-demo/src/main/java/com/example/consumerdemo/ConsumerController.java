package com.example.consumerdemo;

import com.example.consumerdemo.bean.Result;
import com.example.consumerdemo.bean.ResultBig;
import com.example.consumerdemo.client.HttpClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private HttpClient client;

    @RequestMapping(value = "/name/{name}")
    public ResultBig consumerGetStr(@PathVariable String name, @RequestHeader(value = "X-Request-Foo")String head){
        Result result = client.getStr(name);
        return new ResultBig(head, result);
    }

    @RequestMapping(value = "/number/{number}")
    public Result consumerGetNumber(@PathVariable String number){
        return client.getSpecialStr(number);
    }
}
