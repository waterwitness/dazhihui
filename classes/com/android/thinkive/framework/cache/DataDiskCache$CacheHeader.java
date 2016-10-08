package com.android.thinkive.framework.cache;

public class DataDiskCache$CacheHeader
{
  public String key;
  public long size;
  public long ttl;
  
  public DataDiskCache$CacheHeader() {}
  
  public DataDiskCache$CacheHeader(String paramString, Cache.Entry paramEntry)
  {
    this.key = paramString;
    this.size = paramEntry.data.length;
    this.ttl = paramEntry.ttl;
  }
  
  public Cache.Entry toCacheEntry(byte[] paramArrayOfByte)
  {
    Cache.Entry localEntry = new Cache.Entry();
    localEntry.data = paramArrayOfByte;
    localEntry.ttl = this.ttl;
    return localEntry;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DataDiskCache$CacheHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */