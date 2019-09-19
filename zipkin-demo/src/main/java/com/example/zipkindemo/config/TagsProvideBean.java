package com.example.zipkindemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoujx
 */
@Configuration
public class TagsProvideBean {
 
    /**
     * 将MyTagsProvider注入
     * @return MyTagsProvider
     */
    @Bean
    public MyTagsProvider myTagsProvider() {
        return new MyTagsProvider();
    }
 
}