package com.tencent.beaconimsdk.upload;

import android.content.Context;
import com.tencent.beaconimsdk.a.e;
import com.tencent.beaconimsdk.b.a.b;

public final class c
  extends a
{
  public c(Context paramContext)
  {
    super(paramContext, 0, 100);
  }
  
  public final b a()
  {
    Object localObject = com.tencent.beaconimsdk.a.c.m();
    byte[] arrayOfByte = "".getBytes();
    try
    {
      localObject = e.a(c(), (com.tencent.beaconimsdk.a.c)localObject, arrayOfByte, -1, -1);
      if (localObject != null) {
        return (b)localObject;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beaconimsdk.c.a.a(localThrowable);
      com.tencent.beaconimsdk.c.a.d("encode2RequestPackage failed", new Object[0]);
    }
    return null;
  }
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */