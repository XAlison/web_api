package com.seejoke.micro.service.impl;

import com.seejoke.micro.entity.User;
import com.seejoke.micro.mapper.UserMapper;
import com.seejoke.micro.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现代码
 *
 * @author yangzhongying
 * @date 2018/11/12 14:28
 */
@Service
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  @Autowired
  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public int addUser(User user) {
    return userMapper.insert(user);
  }

  @Override
  public int deleteUser(String userId) {
    return userMapper.deleteByPrimaryKey(userId);
  }

  @Override
  public int updateUser(User user) {
    return userMapper.updateByPrimaryKey(user);
  }

  @Override
  public User userDetail(String id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<User> findList(User user) {
    return userMapper.select(user);
  }
}
