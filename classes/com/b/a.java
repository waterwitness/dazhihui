package com.b;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a
{
  private static String a = "//sdcard//SJKH_CERT";
  private static boolean b = false;
  
  public static String a(Context paramContext)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      paramContext = new File(a);
      if (!paramContext.exists()) {
        paramContext.mkdirs();
      }
      b = true;
      return a;
    }
    b = false;
    return paramContext.getFilesDir().getPath();
  }
  
  public static String a(Context paramContext, String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return "-10";
    }
    paramString = "sn_" + paramString + ".sn";
    String str = a(paramContext);
    if (b) {
      try
      {
        paramContext = new File(str + "/" + paramString);
        if (paramContext != null)
        {
          boolean bool = paramContext.exists();
          if (bool) {}
        }
        else
        {
          return "-10";
        }
        paramContext = new FileInputStream(str + "/" + paramString);
        paramString = new byte[paramContext.available()];
        paramContext.read(paramString);
        paramContext.close();
        paramContext = new String(org.a.e.a.a.b(paramString));
        return paramContext;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        return "-1";
      }
    }
    try
    {
      paramContext = paramContext.openFileInput(paramString);
      paramString = new byte[paramContext.available()];
      paramContext.read(paramString);
      paramContext.close();
      paramContext = new String(org.a.e.a.a.b(paramString));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "-2";
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      return "-5";
    }
    paramString1 = "sn_" + paramString1 + ".sn";
    String str = a(paramContext);
    if (b) {}
    for (;;)
    {
      try
      {
        new FileOutputStream(str + "/" + paramString1).write(org.a.e.a.a.a(paramString2.getBytes()));
        return "0";
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        return "-1";
      }
      try
      {
        paramContext = paramContext.openFileOutput(paramString1, 1);
        paramContext.write(org.a.e.a.a.a(paramString2.getBytes()));
        paramContext.flush();
        paramContext.close();
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return "-2";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */