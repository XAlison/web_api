package com.seejoke.micro.commons;

/**
 * 响应结果生成工具
 *
 * @author yangzhongying
 */
public class ResultGenerator {
  private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

  public static Result successResult() {
    return new Result().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE);
  }

  public static <T> Result<T> successResult(T data) {
    return new Result()
        .setCode(ResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE)
        .setData(data);
  }

  public static Result failResult(String message) {
    return new Result().setCode(ResultCode.FAIL).setMessage(message);
  }
}
