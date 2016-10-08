package com.tencent.feedback.common;

import android.os.Build;
import com.tencent.feedback.proguard.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  private static h b = null;
  private boolean a = false;
  
  protected h()
  {
    String str = Build.TAGS;
    if ((str != null) && (str.contains("test-keys"))) {
      e.b("rqdp{  test-keys}", new Object[0]);
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
  
  public static h a()
  {
    try
    {
      if (b == null) {
        b = new h();
      }
      h localh = b;
      return localh;
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
        e.b("rqdp{  super_apk}", new Object[0]);
        bool = true;
      }
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static boolean d()
  {
    Object localObject = a.a(new String[] { "/system/bin/sh", "-c", "type su" });
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        e.b(str, new Object[0]);
        if (str.contains("not found")) {
          return false;
        }
      }
      e.b("rqdp{  sufile}", new Object[0]);
      return true;
    }
    e.b("rqdp{  no response}", new Object[0]);
    return false;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */