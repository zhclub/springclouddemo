package com.zhouhao.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PaymentApi {

    @RequestMapping(value = "/payment/get", method = RequestMethod.GET)
    String getBalance(@RequestParam(name = "id") Long id);

}
