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
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        Assert.assertEquals("zhouhao", userService.getUser(1L));
        Assert.assertEquals("yexun", userService.getUser(2L));
        Assert.assertNull(userService.getUser(3L));
    }

}