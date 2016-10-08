package com.tencent.beacon.upload;

import android.content.Context;
import com.tencent.beacon.a.f;

public final class c
  extends a
{
  public c(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, 0, 100);
  }
  
  public final com.tencent.beacon.c.a.b a()
  {
    Object localObject = f.m();
    byte[] arrayOfByte = "".getBytes();
    try
    {
      localObject = com.tencent.beacon.b.a.a(c(), (f)localObject, arrayOfByte, -1, -1);
      if (localObject != null) {
        return (com.tencent.beacon.c.a.b)localObject;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      com.tencent.beacon.e.b.d("encode2RequestPackage failed", new Object[0]);
    }
    return null;
  }
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */