package com.tencent;

import java.util.List;

public class TIMFriendshipSettings
{
  private List<String> customFields;
  private long flags = 255L;
  
  public List<String> getCustomFields()
  {
    return this.customFields;
  }
  
  public long getFlags()
  {
    return this.flags;
  }
  
  public void setSettings(long paramLong, List<String> paramList)
  {
    this.flags = paramLong;
    this.customFields = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */