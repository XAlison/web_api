package com.seejoke.micro.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import javax.persistence.Transient;

/**
 * 扩展基类对象.
 *
 * @author yangzhongying
 */
public class CommonEntity implements Serializable {

  @JSONField(serialize = false)
  @Transient
  private String dateTime;

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }
}
