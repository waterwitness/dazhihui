package org.apache.a.a.a;

import com.a.a.a.a.c;
import com.a.a.a.a.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a
{
  private static MessageDigest a()
  {
    return a("MD5");
  }
  
  static MessageDigest a(String paramString)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new RuntimeException(paramString.getMessage());
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return a().digest(paramArrayOfByte);
  }
  
  public static byte[] b(String paramString)
  {
    return a(d(paramString));
  }
  
  public static String c(String paramString)
  {
    return c.b(b(paramString));
  }
  
  private static byte[] d(String paramString)
  {
    return d.a(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */