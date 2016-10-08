package com.g.a.a.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

public final class g
  implements Closeable
{
  private final String b;
  private final long c;
  private File[] d;
  private final InputStream[] e;
  private final long[] f;
  
  private g(a parama, String paramString, long paramLong, File[] paramArrayOfFile, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramArrayOfFile;
    this.e = paramArrayOfInputStream;
    this.f = paramArrayOfLong;
  }
  
  public File a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public void close()
  {
    InputStream[] arrayOfInputStream = this.e;
    int j = arrayOfInputStream.length;
    int i = 0;
    while (i < j)
    {
      k.a(arrayOfInputStream[i]);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */