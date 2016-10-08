package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.InputStream;

public final class DiskLruCache$Snapshot
  implements Closeable
{
  private final InputStream[] ins;
  private final String key;
  private final long[] lengths;
  private final long sequenceNumber;
  
  private DiskLruCache$Snapshot(DiskLruCache paramDiskLruCache, String paramString, long paramLong, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.key = paramString;
    this.sequenceNumber = paramLong;
    this.ins = paramArrayOfInputStream;
    this.lengths = paramArrayOfLong;
  }
  
  public void close()
  {
    InputStream[] arrayOfInputStream = this.ins;
    int j = arrayOfInputStream.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      Util.closeQuietly(arrayOfInputStream[i]);
      i += 1;
    }
  }
  
  public DiskLruCache.Editor edit()
  {
    return DiskLruCache.access$5(this.this$0, this.key, this.sequenceNumber);
  }
  
  public InputStream getInputStream(int paramInt)
  {
    return this.ins[paramInt];
  }
  
  public long getLength(int paramInt)
  {
    return this.lengths[paramInt];
  }
  
  public String getString(int paramInt)
  {
    return DiskLruCache.access$6(getInputStream(paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Snapshot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */