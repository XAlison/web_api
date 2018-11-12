package com.seejoke.micro.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seejoke.micro.commons.Result;
import com.seejoke.micro.commons.ResultGenerator;
import com.seejoke.micro.entity.User;
import com.seejoke.micro.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * web api
 *
 * @author yangzhongying
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @Resource private UserService userService;

  /**
   * 查询详细信息
   *
   * @param id
   * @return
   */
  @RequestMapping(value = "/detail", method = RequestMethod.GET)
  public Result detail(@RequestParam String id) {
    User user = userService.userDetail(id);
    return ResultGenerator.successResult(user);
  }

  /**
   * 列表分页查询
   *
   * @param page
   * @param size
   * @param user
   * @return
   */
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public Result list(
      @RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "10") Integer size,
      User user) {
    PageHelper.startPage(page, size);
    List<User> list = userService.findList(user);
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.successResult(pageInfo);
  }

  /**
   * 新增用户数据
   *
   * @param user
   * @return
   */
  @PostMapping("/add")
  public Result add(User user) {
    userService.addUser(user);
    return ResultGenerator.successResult();
  }

  /**
   * 根据主键删除
   *
   * @param id
   * @return
   */
  @PostMapping("/delete")
  public Result delete(@RequestParam String id) {
    userService.deleteUser(id);
    return ResultGenerator.successResult();
  }

  /**
   * 修改数据
   *
   * @param user
   * @return
   */
  @PostMapping("/update")
  public Result update(User user) {
    userService.updateUser(user);
    return ResultGenerator.successResult();
  }
}
