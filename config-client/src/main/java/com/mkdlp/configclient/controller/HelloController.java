package com.mkdlp.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mkdlp
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public String info(){
        return this.profile;
    }
}
