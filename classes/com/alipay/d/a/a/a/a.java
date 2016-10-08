package com.alipay.d.a.a.a;

import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class a
{
  public static File a()
  {
    try
    {
      File localFile = (File)Environment.class.getMethod(new String(com.alipay.d.a.a.a.a.a.a("Z2V0RXh0ZXJuYWxTdG9yYWdlRGlyZWN0b3J5")), new Class[0]).invoke(null, new Object[0]);
      return localFile;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  public static String a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (paramMap == null) {}
    do
    {
      return paramString2;
      paramMap = (String)paramMap.get(paramString1);
    } while (paramMap == null);
    return paramMap;
  }
  
  public static boolean a(String paramString)
  {
    boolean bool2 = false;
    int j;
    boolean bool1;
    if (paramString != null)
    {
      j = paramString.length();
      if (j != 0) {}
    }
    else
    {
      bool1 = true;
      return bool1;
    }
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label48;
      }
      bool1 = bool2;
      if (!Character.isWhitespace(paramString.charAt(i))) {
        break;
      }
      i += 1;
    }
    label48:
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2 == null;
    }
    return paramString1.equals(paramString2);
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, paramString2 });
      return paramString1;
    }
    catch (Exception paramString1) {}
    return paramString2;
  }
  
  public static boolean b(String paramString)
  {
    return !a(paramString);
  }
  
  public static String c(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static String d(String paramString)
  {
    int i = 0;
    try
    {
      if (a(paramString)) {
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
  
  public static String e(String paramString)
  {
    try
    {
      byte[] arrayOfByte = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(paramString.length()).array();
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramString.length());
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramString.getBytes("UTF-8"));
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      paramString = new byte[localByteArrayOutputStream.toByteArray().length + 4];
      System.arraycopy(arrayOfByte, 0, paramString, 0, 4);
      System.arraycopy(localByteArrayOutputStream.toByteArray(), 0, paramString, 4, localByteArrayOutputStream.toByteArray().length);
      paramString = Base64.encodeToString(paramString, 8);
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public static String f(String paramString)
  {
    if (a(paramString)) {
      return "";
    }
    try
    {
      paramString = new ByteArrayInputStream(paramString.getBytes("utf-8"));
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Object localObject = new GZIPOutputStream(localByteArrayOutputStream);
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = paramString.read(arrayOfByte, 0, 1024);
        if (i == -1) {
          break;
        }
        ((GZIPOutputStream)localObject).write(arrayOfByte, 0, i);
      }
      ((GZIPOutputStream)localObject).flush();
      ((GZIPOutputStream)localObject).close();
      localObject = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.flush();
      localByteArrayOutputStream.close();
      paramString.close();
      paramString = new String(Base64.encode((byte[])localObject, 2));
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */