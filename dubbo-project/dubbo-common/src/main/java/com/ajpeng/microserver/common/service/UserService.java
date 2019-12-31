package com.ajpeng.microserver.common.service;


import com.ajpeng.microserver.common.domin.TUser;

import java.util.List;

public interface UserService {
    List<TUser> findUser();
}
