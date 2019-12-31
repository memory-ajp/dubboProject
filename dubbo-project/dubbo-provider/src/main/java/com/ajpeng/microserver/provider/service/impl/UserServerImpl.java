package com.ajpeng.microserver.provider.service.impl;
import com.ajpeng.microserver.common.domin.TUser;
import com.ajpeng.microserver.common.service.UserService;
import com.ajpeng.microserver.provider.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0")
public class UserServerImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<TUser> findUser() {
        return userMapper.findAll();
    }
}
