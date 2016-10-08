package com.android.dazhihui.ui.delegate.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;

public class f
{
  private static Hashtable a = a("c");
  
  public static Hashtable a(String paramString)
  {
    localHashtable = new Hashtable();
    try
    {
      paramString = new String(b(paramString), "UTF-8");
      int j;
      for (int i = 0;; i = j + 1)
      {
        j = paramString.indexOf("\n", i);
        if (j == -1)
        {
          a(localHashtable, paramString.substring(i, paramString.length()));
          return localHashtable;
        }
        a(localHashtable, paramString.substring(i, j));
      }
      return localHashtable;
    }
    catch (Throwable paramString) {}
  }
  
  private static void a(Hashtable paramHashtable, String paramString)
  {
    if (paramString.startsWith("#")) {}
    int i;
    do
    {
      return;
      i = paramString.indexOf("=");
    } while (i == -1);
    paramHashtable.put(paramString.substring(0, i).trim(), paramString.substring(i + 1).trim());
  }
  
  public static byte[] b(String paramString)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramString = new f().getClass().getResourceAsStream("/" + paramString);
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = paramString.read(arrayOfByte);
        if (i == -1)
        {
          paramString.close();
          return localByteArrayOutputStream.toByteArray();
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      return null;
    }
    catch (Exception paramString) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */