package com.tencent;

import java.util.Map;

public class TIMFriendRecommendItem
{
  private long addTime;
  private String identifier;
  private Map<String, byte[]> tags;
  
  public long getAddTime()
  {
    return this.addTime;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public Map<String, byte[]> getTags()
  {
    return this.tags;
  }
  
  void setAddTime(long paramLong)
  {
    this.addTime = paramLong;
  }
  
  void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  void setTags(Map<String, byte[]> paramMap)
  {
    this.tags = paramMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendRecommendItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */