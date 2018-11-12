package com.seejoke.micro.mapper;

import com.seejoke.micro.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 用户dao
 *
 * @author yangzhongying
 */
public interface UserMapper extends Mapper<User>, InsertListMapper<User> {}
