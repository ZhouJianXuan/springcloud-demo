package com.example.consumerdemo.client;

import com.damnhandy.uri.template.UriTemplate;
import com.example.consumerdemo.bean.Result;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;

@Component
public class HttpClient {

    @Resource
    @Qualifier(value = "httpRestTemplate")
    private RestTemplate restTemplate;

    public Result getStr(String name){
        String url = UriTemplate.fromTemplate("http://HELLO-PROVIDER-ZIP/hello/{name}").set("name", name).expand();
        return restTemplate.exchange(UriComponentsBuilder.fromHttpUrl(url).build(true).toUri(), HttpMethod.POST, null, new ParameterizedTypeReference<Result<Person>>() {
        }).getBody();
    }

    public Result getSpecialStr(String number){
        String url = UriTemplate.fromTemplate("http://HELLO-PROVIDER-ZIP/special/{number}").set("number", number).expand();
        return restTemplate.exchange(UriComponentsBuilder.fromHttpUrl(url).build(true).toUri(), HttpMethod.POST, null, new ParameterizedTypeReference<Result<Person>>() {
        }).getBody();
    }
}
