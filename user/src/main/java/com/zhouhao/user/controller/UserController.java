package com.zhouhao.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class UserController implements UserApi{

    private static Map<Long, String> userMap = new HashMap<>();

    @PostConstruct
    public void initial() {
        userMap.put(1L, "zhouhao");
        userMap.put(2L, "yexun");
    }

    @Override
    public String getUser(Long id) {
        log.info("getUser, id:{}", id);
        return userMap.get(id);
    }

    @Override
    public String test() {
        log.info("test");
        return "Success";
    }

    @Override
    public String delay() {
        log.info("delay");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
