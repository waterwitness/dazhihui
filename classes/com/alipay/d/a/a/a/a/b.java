package com.alipay.d.a.a.a.a;

import com.alipay.d.a.a.a.a;
import java.security.MessageDigest;

public final class b
{
  public static String a(String paramString)
  {
    int i = 0;
    try
    {
      if (a.a(paramString)) {
        return null;
      }
      Object localObject = MessageDigest.getInstance("SHA-1");
      ((MessageDigest)localObject).update(paramString.getBytes("UTF-8"));
      paramString = ((MessageDigest)localObject).digest();
      localObject = new StringBuilder();
      while (i < paramString.length)
      {
        ((StringBuilder)localObject).append(String.format("%02x", new Object[] { Byte.valueOf(paramString[i]) }));
        i += 1;
      }
      paramString = ((StringBuilder)localObject).toString();
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */