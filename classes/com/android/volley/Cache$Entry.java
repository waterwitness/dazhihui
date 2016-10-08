package com.android.volley;

import java.util.Collections;
import java.util.Map;

public class Cache$Entry
{
  public byte[] data;
  public String etag;
  public long lastModified;
  public Map<String, String> responseHeaders = Collections.emptyMap();
  public long serverDate;
  public long softTtl;
  public long ttl;
  
  public boolean isExpired()
  {
    return this.ttl < System.currentTimeMillis();
  }
  
  public boolean refreshNeeded()
  {
    return this.softTtl < System.currentTimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\Cache$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */