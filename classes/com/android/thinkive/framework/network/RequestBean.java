package com.android.thinkive.framework.network;

import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.volley.Request.Priority;
import java.util.HashMap;

public class RequestBean
  implements Comparable<RequestBean>
{
  private long cacheTimeout;
  private CacheType cacheType = CacheType.DISK;
  private HashMap<String, String> header;
  private int mSequence;
  private HashMap<String, String> param;
  private Request.Priority priority = Request.Priority.NORMAL;
  private ProtocolType protocolType = ProtocolType.HTTP;
  private boolean shouldCache = false;
  private boolean shouldSign;
  private long startTime;
  private String tag;
  private String urlName;
  
  public RequestBean()
  {
    String str = ConfigManager.getInstance().getSystemConfigValue("shouldSign");
    if (TextUtils.isEmpty(str))
    {
      this.shouldSign = false;
      return;
    }
    this.shouldSign = Boolean.parseBoolean(str);
  }
  
  public int compareTo(RequestBean paramRequestBean)
  {
    return this.mSequence - paramRequestBean.mSequence;
  }
  
  public long getCacheTimeout()
  {
    return this.cacheTimeout;
  }
  
  public CacheType getCacheType()
  {
    return this.cacheType;
  }
  
  public HashMap<String, String> getHeader()
  {
    return this.header;
  }
  
  public HashMap<String, String> getParam()
  {
    return this.param;
  }
  
  public Request.Priority getPriority()
  {
    return this.priority;
  }
  
  public ProtocolType getProtocolType()
  {
    return this.protocolType;
  }
  
  public int getSequence()
  {
    return this.mSequence;
  }
  
  public long getStartTime()
  {
    return this.startTime;
  }
  
  public String getTag()
  {
    return this.tag;
  }
  
  public String getUrlName()
  {
    return this.urlName;
  }
  
  public boolean isShouldSign()
  {
    return this.shouldSign;
  }
  
  public void setCacheTimeout(long paramLong)
  {
    this.cacheTimeout = paramLong;
  }
  
  public void setCacheType(CacheType paramCacheType)
  {
    this.cacheType = paramCacheType;
  }
  
  public void setHeader(HashMap<String, String> paramHashMap)
  {
    this.header = paramHashMap;
  }
  
  public void setParam(HashMap<String, String> paramHashMap)
  {
    this.param = paramHashMap;
  }
  
  public void setPriority(Request.Priority paramPriority)
  {
    this.priority = paramPriority;
  }
  
  public void setProtocolType(ProtocolType paramProtocolType)
  {
    this.protocolType = paramProtocolType;
  }
  
  public void setSequence(int paramInt)
  {
    this.mSequence = paramInt;
  }
  
  public void setShouldCache(boolean paramBoolean)
  {
    this.shouldCache = paramBoolean;
  }
  
  public void setShouldSign(boolean paramBoolean)
  {
    this.shouldSign = paramBoolean;
  }
  
  public void setStartTime(long paramLong)
  {
    this.startTime = paramLong;
  }
  
  public void setTag(String paramString)
  {
    this.tag = paramString;
  }
  
  public void setUrlName(String paramString)
  {
    this.urlName = paramString;
  }
  
  public boolean shouldCache()
  {
    return this.shouldCache;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\RequestBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */