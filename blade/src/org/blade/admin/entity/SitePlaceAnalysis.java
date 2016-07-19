package org.blade.admin.entity;

import java.util.Date;

/** 
 * 渠道跟踪
 */
public class SitePlaceAnalysis {


  protected int id;
  protected String name;
  protected String keyWord;
  protected int userId;
  protected String mobilePhone;
  protected String ip;
  protected String email;
  protected String ad;
  protected String isAd;
  protected Date date;
  protected String ipProv;
  protected String ipCity;
  protected String firstPlaceAddr;
  protected String noFirstPlaceAddr;
  protected String arrivedAddr;

  public SitePlaceAnalysis()
  {
  }

  /**
   * 获取编号
   */
  public int getId()
  {
    return id;
  }
  /**
   * 设置编号
   */
  public void setId(int value)
  {
    this.id = value;
  }
  /**
   * 获取名称
   */
  public String getName()
  {
    return name;
  }
  /**
   * 设置名称
   */
  public void setName(String value)
  {
    this.name = value;
  }
  /**
   * 获取关键词
   */
  public String getKeyWord()
  {
    return keyWord;
  }
  /**
   * 设置关键词
   */
  public void setKeyWord(String value)
  {
    this.keyWord = value;
  }
  /**
   * 获取用户ID
   */
  public int getUserId()
  {
    return userId;
  }
  /**
   * 设置用户ID
   */
  public void setUserId(int value)
  {
    this.userId = value;
  }
  /**
   * 获取手机号码
   */
  public String getMobilePhone()
  {
    return mobilePhone;
  }
  /**
   * 设置手机号码
   */
  public void setMobilePhone(String value)
  {
    this.mobilePhone = value;
  }
  /**
   * 获取访问IP地址
   */
  public String getIp()
  {
    return ip;
  }
  /**
   * 设置访问IP地址
   */
  public void setIp(String value)
  {
    this.ip = value;
  }
  /**
   * 获取电子邮箱
   */
  public String getEmail()
  {
    return email;
  }
  /**
   * 设置电子邮箱
   */
  public void setEmail(String value)
  {
    this.email = value;
  }
  /**
   * 获取广告商
   */
  public String getAd()
  {
    return ad;
  }
  /**
   * 设置广告商
   */
  public void setAd(String value)
  {
    this.ad = value;
  }
  /**
   * 获取是否为广告
   */
  public String getIsAd()
  {
    return isAd;
  }
  /**
   * 设置是否为广告
   */
  public void setIsAd(String value)
  {
    this.isAd = value;
  }
  /**
   * 获取注册日期
   */
  public Date getDate()
  {
    return date;
  }
  /**
   * 设置注册日期
   */
  public void setDate(Date value)
  {
    this.date = value;
  }
  /**
   * 获取IP所属省份
   */
  public String getIpProv()
  {
    return ipProv;
  }
  /**
   * 设置IP所属省份
   */
  public void setIpProv(String value)
  {
    this.ipProv = value;
  }
  /**
   * 获取IP所属城市
   */
  public String getIpCity()
  {
    return ipCity;
  }
  /**
   * 设置IP所属城市
   */
  public void setIpCity(String value)
  {
    this.ipCity = value;
  }
  /**
   * 获取渠道首页
   */
  public String getFirstPlaceAddr()
  {
    return firstPlaceAddr;
  }
  /**
   * 设置渠道首页
   */
  public void setFirstPlaceAddr(String value)
  {
    this.firstPlaceAddr = value;
  }
  /**
   * 获取非渠道首页
   */
  public String getNoFirstPlaceAddr()
  {
    return noFirstPlaceAddr;
  }
  /**
   * 设置非渠道首页
   */
  public void setNoFirstPlaceAddr(String value)
  {
    this.noFirstPlaceAddr = value;
  }
  /**
   * 获取到达地址
   */
  public String getArrivedAddr()
  {
    return arrivedAddr;
  }
  /**
   * 设置到达地址
   */
  public void setArrivedAddr(String value)
  {
    this.arrivedAddr = value;
  }

}