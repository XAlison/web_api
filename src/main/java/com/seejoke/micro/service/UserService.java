package com.seejoke.micro.service;

import com.seejoke.micro.entity.User;
import java.util.List;

/**
 * 业务方法定义demo
 *
 * @author yangzhongying
 * @date 2018/11/12 14:28
 */
public interface UserService {

  /**
   * 新增用户
   *
   * @param user
   * @return
   */
  int addUser(User user);

  /**
   * 删除用户
   *
   * @param userId
   * @return
   */
  int deleteUser(String userId);

  /**
   * 修改用户
   *
   * @param user
   * @return
   */
  int updateUser(User user);

  /**
   * 用户详细信息
   *
   * @param user
   * @return
   */
  User userDetail(String user);

  /**
   * 查询用户列表
   *
   * @param user
   * @return
   */
  List<User> findList(User user);
}
