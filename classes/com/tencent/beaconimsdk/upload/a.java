package com.tencent.beaconimsdk.upload;

import android.content.Context;
import com.tencent.beaconimsdk.a.b.d;
import com.tencent.beaconimsdk.a.b.d.a;
import com.tencent.beaconimsdk.a.c;
import com.tencent.beaconimsdk.a.e;

public abstract class a
{
  protected final int a;
  protected final int b;
  protected Context c;
  protected String d;
  
  public a(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
  }
  
  public static com.tencent.beaconimsdk.b.a.b a(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = e.a(paramInt, c.m(), paramArrayOfByte, 2, 3);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      com.tencent.beaconimsdk.c.a.c("imposiable comStrategy error:%s", new Object[] { paramArrayOfByte.toString() });
      com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
    }
    return null;
  }
  
  public abstract com.tencent.beaconimsdk.b.a.b a();
  
  public void b()
  {
    com.tencent.beaconimsdk.c.a.c("encode failed, clear db data", new Object[0]);
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
        return com.tencent.beaconimsdk.a.b.b.a(this.c).e().b();
      }
      String str = com.tencent.beaconimsdk.a.b.b.a(this.c).e().b(this.b).b();
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beaconimsdk.c.a.c("imposiable comStrategy error:%s", new Object[] { localThrowable.toString() });
      com.tencent.beaconimsdk.c.a.a(localThrowable);
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */