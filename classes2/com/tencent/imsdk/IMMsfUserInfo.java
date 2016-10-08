package com.tencent.imsdk;

import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.openqq.IMPushListener;
import java.util.concurrent.ConcurrentHashMap;

public class IMMsfUserInfo
{
  private static final String tag = "IMMsfUserInfo";
  ConcurrentHashMap<String, TIMValueCallBack<byte[]>> cmd2PushCallBack = new ConcurrentHashMap();
  ConcurrentHashMap<String, IMPushListener> cmd2PushListener = new ConcurrentHashMap();
  private boolean isLoggedIn = false;
  private boolean isSigExpire = false;
  private long tinyid = 0L;
  private TIMUser user = new TIMUser();
  
  public ConcurrentHashMap<String, TIMValueCallBack<byte[]>> getCmd2PushCallBack()
  {
    return this.cmd2PushCallBack;
  }
  
  public ConcurrentHashMap<String, IMPushListener> getCmd2PushListener()
  {
    return this.cmd2PushListener;
  }
  
  public long getTinyid()
  {
    return this.tinyid;
  }
  
  public String getUidType()
  {
    if (this.user != null) {
      return this.user.getAccountType();
    }
    return "";
  }
  
  public TIMUser getUser()
  {
    return this.user;
  }
  
  public String getUserId()
  {
    if (this.user != null) {
      return this.user.getIdentifier();
    }
    return "";
  }
  
  public String getsUerAppId()
  {
    if (this.user != null) {
      return this.user.getAppIdAt3rd();
    }
    return "";
  }
  
  public boolean isLoggedIn()
  {
    return this.isLoggedIn;
  }
  
  public boolean isSigExpire()
  {
    return this.isSigExpire;
  }
  
  public void setIsLoggedIn(boolean paramBoolean)
  {
    QLog.d("IMMsfUserInfo", 1, "set login flag to: " + paramBoolean + "|" + this.user.getIdentifier());
    this.isLoggedIn = paramBoolean;
  }
  
  public void setIsSigExpire(boolean paramBoolean)
  {
    this.isSigExpire = paramBoolean;
  }
  
  public void setPushCallBack(String paramString, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    this.cmd2PushCallBack.put(paramString, paramTIMValueCallBack);
  }
  
  public void setPushListener(String paramString, IMPushListener paramIMPushListener)
  {
    this.cmd2PushListener.put(paramString, paramIMPushListener);
  }
  
  public void setTinyid(long paramLong)
  {
    this.tinyid = paramLong;
  }
  
  public void setUser(TIMUser paramTIMUser)
  {
    this.user = paramTIMUser;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\IMMsfUserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */