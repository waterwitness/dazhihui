package com.android.dazhihui.ui.widget.a;

import java.io.Closeable;
import java.io.InputStream;

public final class q
  implements Closeable
{
  private final String b;
  private final long c;
  private final InputStream[] d;
  
  private q(l paraml, String paramString, long paramLong, InputStream[] paramArrayOfInputStream)
  {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramArrayOfInputStream;
  }
  
  public InputStream a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public void close()
  {
    InputStream[] arrayOfInputStream = this.d;
    int j = arrayOfInputStream.length;
    int i = 0;
    while (i < j)
    {
      l.a(arrayOfInputStream[i]);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */