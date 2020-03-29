package com.zhouhao.core.controller;

import com.zhouhao.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @Autowired
    private UserService userService;

}
