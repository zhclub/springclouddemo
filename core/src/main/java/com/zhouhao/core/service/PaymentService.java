package com.zhouhao.core.service;

import com.zhouhao.payment.controller.PaymentApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "payment")
public interface PaymentService extends PaymentApi {
}
