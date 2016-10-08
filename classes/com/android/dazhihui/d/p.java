package com.android.dazhihui.d;

import android.content.Context;
import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class p
{
  private static p a;
  
  public static p a()
  {
    if (a == null) {
      a = new p();
    }
    return a;
  }
  
  private Map<String, String> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if (b(paramString)) {
      try
      {
        paramString = new BufferedReader(new FileReader(paramString));
        for (;;)
        {
          String str = paramString.readLine();
          if (str == null) {
            break;
          }
          localHashMap.put(str, str);
        }
        return localHashMap;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
    paramString.close();
    return localHashMap;
  }
  
  private boolean b()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  private boolean b(String paramString)
  {
    return new File(paramString).exists();
  }
  
  public Map<String, String> a(Context paramContext)
  {
    new HashMap();
    String str1 = File.separator + ".ids" + File.separator + ".dzh_ids.dat";
    if (b())
    {
      String str2 = Environment.getExternalStorageDirectory().getPath() + str1;
      if (b(str2)) {
        return a(str2);
      }
      return a("/data/data/" + paramContext.getPackageName() + str1);
    }
    return a("/data/data/" + paramContext.getPackageName() + str1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */