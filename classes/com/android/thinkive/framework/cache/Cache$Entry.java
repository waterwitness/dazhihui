package com.android.thinkive.framework.cache;

public class Cache$Entry
{
  public byte[] data;
  public long ttl;
  
  public boolean isExpired()
  {
    return this.ttl < System.currentTimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\Cache$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */