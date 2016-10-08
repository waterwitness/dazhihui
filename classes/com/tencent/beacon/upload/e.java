package com.tencent.beacon.upload;

import com.tencent.beacon.e.b;

public class e
{
  private long a = 0L;
  private long b = 0L;
  private int c = 0;
  private long d = 0L;
  private String e = "";
  
  public long a()
  {
    try
    {
      long l = this.a;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.c = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    try
    {
      b.h("recevied: %d", new Object[] { Long.valueOf(paramLong1) });
      this.b += paramLong1;
      this.d = paramLong2;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(String paramString1, long paramLong, String paramString2, int paramInt)
  {
    try
    {
      b.h("send: %s sz: %d apn: %s", new Object[] { paramString1, Long.valueOf(paramLong), paramString2 });
      this.e = paramString2;
      this.c += 1;
      this.a += paramLong;
      a(paramInt);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public long b()
  {
    try
    {
      long l = this.b;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int c()
  {
    try
    {
      int i = this.c;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long d()
  {
    try
    {
      long l = this.d;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String e()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */