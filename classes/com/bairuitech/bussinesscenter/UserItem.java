package com.bairuitech.bussinesscenter;

import android.util.Log;
import java.io.Serializable;

public class UserItem
  implements Serializable, Cloneable
{
  public static final int USERINFO_IP = 2;
  public static final int USERINFO_NAME = 1;
  public static final int USERSTATUS_OFFLINE = 0;
  public static final int USERSTATUS_ONLINE = 1;
  private static final long serialVersionUID = 8502706820090766507L;
  private int mGroupId;
  private String mStrIp;
  private String mStrName;
  private int mUserId;
  private int mUserIdenty;
  
  public UserItem()
  {
    this.mStrName = "";
  }
  
  public UserItem(int paramInt, String paramString1, String paramString2)
  {
    this.mStrName = paramString1;
    this.mUserId = paramInt;
    this.mStrIp = paramString2;
  }
  
  public UserItem clone()
  {
    try
    {
      UserItem localUserItem = (UserItem)super.clone();
      return localUserItem;
    }
    catch (Exception localException)
    {
      Log.i("useritem-clone", localException.toString());
    }
    return null;
  }
  
  public int getGroupId()
  {
    return this.mGroupId;
  }
  
  public String getIp()
  {
    return this.mStrIp;
  }
  
  public int getUserId()
  {
    return this.mUserId;
  }
  
  public int getUserIdenty()
  {
    return this.mUserIdenty;
  }
  
  public String getUserName()
  {
    return this.mStrName;
  }
  
  public void setGroupId(int paramInt)
  {
    this.mGroupId = paramInt;
  }
  
  public void setIp(String paramString)
  {
    this.mStrIp = paramString;
  }
  
  public void setUserId(int paramInt)
  {
    this.mUserId = paramInt;
  }
  
  public void setUserIenty(int paramInt)
  {
    this.mUserIdenty = paramInt;
  }
  
  public void setUserName(String paramString)
  {
    this.mStrName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\bussinesscenter\UserItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */