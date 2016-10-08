package com.tencent.mm.a;

import android.util.Base64;
import javax.crypto.Cipher;

public final class a
{
  private Cipher j;
  
  public final String h(String paramString)
  {
    try
    {
      Object localObject = Base64.decode(paramString, 0);
      localObject = new String(this.j.doFinal((byte[])localObject), "UTF8");
      return (String)localObject;
    }
    catch (Exception localException)
    {
      return "[des]" + paramString + "|" + localException.toString();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */