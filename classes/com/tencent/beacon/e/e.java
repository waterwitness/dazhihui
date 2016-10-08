package com.tencent.beacon.e;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
{
  private static e b = null;
  private boolean a = false;
  
  protected e()
  {
    String str = Build.TAGS;
    if ((str != null) && (str.contains("test-keys"))) {
      b.b(" test-keys}", new Object[0]);
    }
    for (;;)
    {
      if ((i == 0) && (!c()) && (!d())) {
        this.a = false;
      }
      return;
      i = 0;
    }
  }
  
  public static e a()
  {
    try
    {
      if (b == null) {
        b = new e();
      }
      e locale = b;
      return locale;
    }
    finally {}
  }
  
  private static boolean c()
  {
    boolean bool = false;
    try
    {
      if (new File("/system/app/Superuser.apk").exists())
      {
        b.b(" super_apk}", new Object[0]);
        bool = true;
      }
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static boolean d()
  {
    Object localObject = e();
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        b.b(str, new Object[0]);
        if (str.contains("not found")) {
          return false;
        }
      }
      b.b(" sufile}", new Object[0]);
      return true;
    }
    b.b(" no response}", new Object[0]);
    return false;
  }
  
  private static ArrayList<String> e()
  {
    ArrayList localArrayList = new ArrayList();
    String str;
    Object localObject;
    try
    {
      Process localProcess = Runtime.getRuntime().exec(new String[] { "/system/bin/sh", "-c", "type su" });
      localBufferedReader = new BufferedReader(new InputStreamReader(localProcess.getInputStream()));
      for (;;)
      {
        str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        localArrayList.add(str);
      }
      return (ArrayList<String>)localObject;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      localObject = null;
    }
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(((Process)localObject).getErrorStream()));
    for (;;)
    {
      str = localBufferedReader.readLine();
      localObject = localArrayList;
      if (str == null) {
        break;
      }
      localArrayList.add(str);
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */