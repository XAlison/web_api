package com.seejoke.micro;

import com.seejoke.micro.entity.User;
import com.seejoke.micro.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

  @Autowired private UserService userService;

  @Test
  public void insertMsg() {
    User user = new User();
    user.setUserId(System.currentTimeMillis() + "");
    user.setOpenId("123456");
    user.setIp("127.0.0.1");
    userService.addUser(user);
  }
}
