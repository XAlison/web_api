package com.seejoke.micro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目启动入口
 *
 * @author yangzhongying
 */
@SpringBootApplication
@EnableWebMvc
@EnableAsync
@EnableScheduling
@MapperScan(basePackages = "com.seejoke.micro.mapper")
public class Application implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    logger.info("服务运行完成");
  }
}
