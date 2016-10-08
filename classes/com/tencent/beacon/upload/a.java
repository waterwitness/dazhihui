package com.tencent.beacon.upload;

import android.content.Context;
import com.tencent.beacon.a.b.c;
import com.tencent.beacon.a.b.e;
import com.tencent.beacon.a.b.e.a;
import com.tencent.beacon.a.f;

public abstract class a
{
  protected final int a;
  protected final int b;
  protected Context c;
  protected String d;
  protected int e;
  
  public a(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
  }
  
  public static com.tencent.beacon.c.a.b a(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    int i = -1;
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        paramContext = c.a(paramContext).d();
        if (paramContext != null)
        {
          j = paramContext.k();
          i = paramContext.l();
          paramContext = paramContext.m();
          paramContext = com.tencent.beacon.b.a.a(paramArrayOfByte, i, j, paramContext);
          k = i;
          m = j;
          paramArrayOfByte = paramContext;
          if (paramContext == null)
          {
            com.tencent.beacon.e.b.c("enzp error! :%d %d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            return null;
          }
          paramContext = com.tencent.beacon.b.a.a(paramInt, f.m(), paramArrayOfByte, k, m);
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        com.tencent.beacon.e.b.c("imposiable comStrategy error:%s", new Object[] { paramContext.toString() });
        paramContext.printStackTrace();
        return null;
      }
      paramContext = null;
      int j = -1;
      continue;
      int m = -1;
      int k = i;
    }
  }
  
  public abstract com.tencent.beacon.c.a.b a();
  
  public void b()
  {
    com.tencent.beacon.e.b.c("encode failed, clear db data", new Object[0]);
  }
  
  public abstract void b(boolean paramBoolean);
  
  public final int c()
  {
    return this.a;
  }
  
  public final String d()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      if (this.b == 0) {
        return c.a(this.c).d().b();
      }
      String str = c.a(this.c).d().b(this.b).b();
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.c("imposiable comStrategy error:%s", new Object[] { localThrowable.toString() });
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public final int f()
  {
    try
    {
      int i = this.e;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */