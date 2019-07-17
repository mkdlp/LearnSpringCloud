package com.mkdlp.hystrix.remote;

import com.mkdlp.hystrix.fallback.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="hello-server",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
