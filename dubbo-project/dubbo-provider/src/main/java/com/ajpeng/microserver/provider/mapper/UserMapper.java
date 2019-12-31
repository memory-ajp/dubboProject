package com.ajpeng.microserver.provider.mapper;

import com.ajpeng.microserver.common.domin.TUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

   @Select("select * from t_user")
   List<TUser> findAll();

}
