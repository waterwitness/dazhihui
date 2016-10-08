package com.android.dazhihui.ui.delegate.screen.a.a;

import android.util.Base64;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
{
  public static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.getBytes().length;
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (i > 16) {
        str = b(paramString);
      }
    }
    paramString = "";
    int j = str.getBytes().length;
    i = 0;
    while (i < 16 - j)
    {
      paramString = paramString + " ";
      i += 1;
    }
    return str + paramString;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    return d(d(paramString3), a(paramString1), a(paramString2));
  }
  
  public static String b(String paramString)
  {
    while (paramString.getBytes().length > 16) {
      paramString = paramString.substring(0, paramString.length() - 1);
    }
    return paramString;
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = c(paramString3, a(paramString1), a(paramString2));
    if (paramString1 != null) {
      return c(paramString1);
    }
    return null;
  }
  
  public static String c(String paramString)
  {
    return Pattern.compile("\t|\r|\n").matcher(paramString).replaceAll("").replace('+', '*').replace('/', '-').replace('=', '.');
  }
  
  private static String c(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2 == null)
    {
      System.out.print("Key为空null");
      return null;
    }
    if (paramString2.length() != 16)
    {
      System.out.print("Key长度不是16位");
      return null;
    }
    if (paramString3 == null)
    {
      System.out.print("加密向量iv为空null");
      return null;
    }
    paramString1 = paramString1.getBytes("utf-8");
    paramString2 = new SecretKeySpec(paramString2.getBytes("utf-8"), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
    int j = paramString1.length;
    int k = localCipher.getBlockSize();
    int i = j;
    if (j % k != 0) {
      i = j + (k - j % k);
    }
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramString1, 0, arrayOfByte, 0, paramString1.length);
    localCipher.init(1, paramString2, new IvParameterSpec(paramString3.getBytes("utf-8")));
    return Base64.encodeToString(localCipher.doFinal(arrayOfByte), 0);
  }
  
  public static String d(String paramString)
  {
    return paramString.replace('.', '=').replace('*', '+').replace('-', '/');
  }
  
  private static String d(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2 == null) {}
    try
    {
      System.out.print("Key为空null");
      return null;
    }
    catch (Exception paramString1)
    {
      System.out.println(paramString1.toString());
      return null;
    }
    if (paramString2.length() != 16)
    {
      System.out.print("Key长度不是16位");
      return null;
    }
    if (paramString3 == null)
    {
      System.out.print("加密向量iv为空null");
      return null;
    }
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes("utf-8"), "AES");
    paramString2 = Cipher.getInstance("AES/CBC/NoPadding");
    paramString2.init(2, localSecretKeySpec, new IvParameterSpec(paramString3.getBytes("utf-8")));
    paramString1 = Base64.decode(paramString1, 0);
    try
    {
      paramString1 = new String(paramString2.doFinal(paramString1), "UTF-8");
      return paramString1;
    }
    catch (Exception paramString1)
    {
      System.out.println(paramString1.toString());
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */