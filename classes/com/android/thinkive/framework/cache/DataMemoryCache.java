package com.android.thinkive.framework.cache;

import android.support.v4.c.g;

public class DataMemoryCache
  implements Cache
{
  private static DataMemoryCache sInstance;
  private g<String, Cache.Entry> mCache = new DataMemoryCache.1(this, (int)(Runtime.getRuntime().maxMemory() / 8L));
  
  public static DataMemoryCache getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new DataMemoryCache();
      }
      DataMemoryCache localDataMemoryCache = sInstance;
      return localDataMemoryCache;
    }
    finally {}
  }
  
  private int occupyofCacheEntry(Cache.Entry paramEntry)
  {
    return paramEntry.data.length + 8 + 1;
  }
  
  public void clear()
  {
    this.mCache.evictAll();
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  public Cache.Entry get(String paramString)
  {
    return (Cache.Entry)this.mCache.get(paramString);
  }
  
  public void initialize() {}
  
  public void invalidate(String paramString, boolean paramBoolean)
  {
    Cache.Entry localEntry = get(paramString);
    if (localEntry != null)
    {
      if (paramBoolean) {
        localEntry.ttl = 0L;
      }
      put(paramString, localEntry);
    }
  }
  
  public void put(String paramString, Cache.Entry paramEntry)
  {
    this.mCache.put(paramString, paramEntry);
  }
  
  public void remove(String paramString)
  {
    this.mCache.remove(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DataMemoryCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */