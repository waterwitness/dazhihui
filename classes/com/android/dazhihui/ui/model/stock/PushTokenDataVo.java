package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;

public class PushTokenDataVo
  implements Serializable
{
  private static final long serialVersionUID = 406622206716183448L;
  private String appid;
  private String create_time;
  private String duration;
  private String refresh_time;
  private String result;
  private String token;
  private String uid;
  
  public String getAppid()
  {
    return this.appid;
  }
  
  public String getCreate_time()
  {
    return this.create_time;
  }
  
  public String getDuration()
  {
    return this.duration;
  }
  
  public String getRefresh_time()
  {
    return this.refresh_time;
  }
  
  public String getResult()
  {
    return this.result;
  }
  
  public String getToken()
  {
    return this.token;
  }
  
  public String getUid()
  {
    return this.uid;
  }
  
  public void setAppid(String paramString)
  {
    this.appid = paramString;
  }
  
  public void setCreate_time(String paramString)
  {
    this.create_time = paramString;
  }
  
  public void setDuration(String paramString)
  {
    this.duration = paramString;
  }
  
  public void setRefresh_time(String paramString)
  {
    this.refresh_time = paramString;
  }
  
  public void setResult(String paramString)
  {
    this.result = paramString;
  }
  
  public void setToken(String paramString)
  {
    this.token = paramString;
  }
  
  public void setUid(String paramString)
  {
    this.uid = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\PushTokenDataVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */