package com.tencent.beacon.upload;

import android.content.Context;

public abstract class f
{
  private static f a = null;
  
  public static f a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new f.a(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public abstract byte[] a(String paramString, byte[] paramArrayOfByte, e parame, a parama);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */