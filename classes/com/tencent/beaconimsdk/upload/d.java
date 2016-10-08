package com.tencent.beaconimsdk.upload;

import android.content.Context;

public abstract class d
{
  private static d a = null;
  
  public static d a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new d.a(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public abstract byte[] a(String paramString, byte[] paramArrayOfByte, a parama);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */