package com.zhouhao.core.service;

import com.zhouhao.user.controller.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user")
public interface UserService extends UserApi {
}
