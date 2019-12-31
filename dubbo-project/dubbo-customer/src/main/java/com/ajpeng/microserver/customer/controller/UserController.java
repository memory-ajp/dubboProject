package com.ajpeng.microserver.customer.controller;

import com.ajpeng.microserver.common.domin.TUser;
import com.ajpeng.microserver.common.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public List<TUser> user() {
        return userService.findUser();
    }
}
