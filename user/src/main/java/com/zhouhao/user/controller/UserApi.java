package com.zhouhao.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserApi {

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    String getUser(@RequestParam(value = "id") Long id);

    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
    String test();

    @RequestMapping(value = "/user/delay", method = RequestMethod.GET)
    String delay();
}
