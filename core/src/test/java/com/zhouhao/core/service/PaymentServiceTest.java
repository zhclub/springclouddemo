package com.zhouhao.core.service;

import com.zhouhao.core.CoreApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CoreApplication.class)
@RunWith(SpringRunner.class)
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void testGetUser() {
        Assert.assertEquals("1", paymentService.getBalance(1L));
        Assert.assertEquals("2", paymentService.getBalance(2L));
        Assert.assertNull(paymentService.getBalance(3L));
    }
}