package com.zhouhao.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/gateway/health")
    public String health() {
        return "SUCCESS";
    }

}
