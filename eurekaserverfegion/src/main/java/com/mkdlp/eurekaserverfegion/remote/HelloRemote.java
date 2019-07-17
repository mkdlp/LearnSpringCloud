package com.mkdlp.eurekaserverfegion.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="hello-server")
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name")String name);
}
