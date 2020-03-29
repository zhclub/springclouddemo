package com.zhouhao.payment.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController implements PaymentApi{

    private static Map<Long, String> payMap;

    static {
        payMap = new HashMap<>();
        payMap.put(1L, "1");
        payMap.put(2L, "2");
    }

    @Override
    public String getBalance(Long id) {
        return payMap.get(id);
    }
}
