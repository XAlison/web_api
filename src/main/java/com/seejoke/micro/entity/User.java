package com.seejoke.micro.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体model
 *
 * @author yangzhongying
 */
@Table(name = "tb_user")
public class User {
  @Id
  @Column(name = "user_id")
  private String userId;

  @Column(name = "open_id")
  private String openId;

  @Column(name = "user_token")
  private String userToken;

  private String city;

  private String nickname;

  private String avatar;

  private String sex;

  @Column(name = "create_time")
  private Date createTime;

  @Column(name = "update_time")
  private Date updateTime;

  private String ip;

  /** 密码 */
  private String pwd;

  /** 用户状态 */
  @Column(name = "user_status")
  private Integer userStatus;

  /** 手机号码 */
  private String mobile;

  /** @return user_id */
  public String getUserId() {
    return userId;
  }

  /** @param userId */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /** @return open_id */
  public String getOpenId() {
    return openId;
  }

  /** @param openId */
  public void setOpenId(String openId) {
    this.openId = openId;
  }

  /** @return user_token */
  public String getUserToken() {
    return userToken;
  }

  /** @param userToken */
  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  /** @return city */
  public String getCity() {
    return city;
  }

  /** @param city */
  public void setCity(String city) {
    this.city = city;
  }

  /** @return nickname */
  public String getNickname() {
    return nickname;
  }

  /** @param nickname */
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /** @return avatar */
  public String getAvatar() {
    return avatar;
  }

  /** @param avatar */
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /** @return sex */
  public String getSex() {
    return sex;
  }

  /** @param sex */
  public void setSex(String sex) {
    this.sex = sex;
  }

  /** @return create_time */
  public Date getCreateTime() {
    return createTime;
  }

  /** @param createTime */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /** @return update_time */
  public Date getUpdateTime() {
    return updateTime;
  }

  /** @param updateTime */
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  /** @return ip */
  public String getIp() {
    return ip;
  }

  /** @param ip */
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * 获取密码
   *
   * @return pwd - 密码
   */
  public String getPwd() {
    return pwd;
  }

  /**
   * 设置密码
   *
   * @param pwd 密码
   */
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  /**
   * 获取用户状态
   *
   * @return user_status - 用户状态
   */
  public Integer getUserStatus() {
    return userStatus;
  }

  /**
   * 设置用户状态
   *
   * @param userStatus 用户状态
   */
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  /**
   * 获取手机号码
   *
   * @return mobile - 手机号码
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * 设置手机号码
   *
   * @param mobile 手机号码
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}
