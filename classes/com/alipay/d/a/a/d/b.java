package com.alipay.d.a.a.d;

import android.os.Environment;
import java.io.File;

public final class b
{
  public static String a(String paramString)
  {
    try
    {
      if (a())
      {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (new File(str, paramString).exists())
        {
          paramString = com.alipay.d.a.a.a.b.a(str, paramString);
          return paramString;
        }
      }
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return (str != null) && (str.length() > 0) && ((str.equals("mounted")) || (str.equals("mounted_ro"))) && (Environment.getExternalStorageDirectory() != null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */