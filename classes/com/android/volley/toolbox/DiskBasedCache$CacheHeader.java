package com.android.volley.toolbox;

import com.android.volley.Cache.Entry;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

class DiskBasedCache$CacheHeader
{
  public String etag;
  public String key;
  public long lastModified;
  public Map<String, String> responseHeaders;
  public long serverDate;
  public long size;
  public long softTtl;
  public long ttl;
  
  private DiskBasedCache$CacheHeader() {}
  
  public DiskBasedCache$CacheHeader(String paramString, Cache.Entry paramEntry)
  {
    this.key = paramString;
    this.size = paramEntry.data.length;
    this.etag = paramEntry.etag;
    this.serverDate = paramEntry.serverDate;
    this.lastModified = paramEntry.lastModified;
    this.ttl = paramEntry.ttl;
    this.softTtl = paramEntry.softTtl;
    this.responseHeaders = paramEntry.responseHeaders;
  }
  
  public static CacheHeader readHeader(InputStream paramInputStream)
  {
    CacheHeader localCacheHeader = new CacheHeader();
    if (DiskBasedCache.readInt(paramInputStream) != 538247942) {
      throw new IOException();
    }
    localCacheHeader.key = DiskBasedCache.readString(paramInputStream);
    localCacheHeader.etag = DiskBasedCache.readString(paramInputStream);
    if (localCacheHeader.etag.equals("")) {
      localCacheHeader.etag = null;
    }
    localCacheHeader.serverDate = DiskBasedCache.readLong(paramInputStream);
    localCacheHeader.lastModified = DiskBasedCache.readLong(paramInputStream);
    localCacheHeader.ttl = DiskBasedCache.readLong(paramInputStream);
    localCacheHeader.softTtl = DiskBasedCache.readLong(paramInputStream);
    localCacheHeader.responseHeaders = DiskBasedCache.readStringStringMap(paramInputStream);
    return localCacheHeader;
  }
  
  public Cache.Entry toCacheEntry(byte[] paramArrayOfByte)
  {
    Cache.Entry localEntry = new Cache.Entry();
    localEntry.data = paramArrayOfByte;
    localEntry.etag = this.etag;
    localEntry.serverDate = this.serverDate;
    localEntry.lastModified = this.lastModified;
    localEntry.ttl = this.ttl;
    localEntry.softTtl = this.softTtl;
    localEntry.responseHeaders = this.responseHeaders;
    return localEntry;
  }
  
  public boolean writeHeader(OutputStream paramOutputStream)
  {
    try
    {
      DiskBasedCache.writeInt(paramOutputStream, 538247942);
      DiskBasedCache.writeString(paramOutputStream, this.key);
      if (this.etag == null) {}
      for (String str = "";; str = this.etag)
      {
        DiskBasedCache.writeString(paramOutputStream, str);
        DiskBasedCache.writeLong(paramOutputStream, this.serverDate);
        DiskBasedCache.writeLong(paramOutputStream, this.lastModified);
        DiskBasedCache.writeLong(paramOutputStream, this.ttl);
        DiskBasedCache.writeLong(paramOutputStream, this.softTtl);
        DiskBasedCache.writeStringStringMap(this.responseHeaders, paramOutputStream);
        paramOutputStream.flush();
        return true;
      }
      return false;
    }
    catch (IOException paramOutputStream)
    {
      VolleyLog.d("%s", new Object[] { paramOutputStream.toString() });
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\DiskBasedCache$CacheHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */