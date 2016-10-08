package com.baidu.location.e;

import android.content.Context;
import android.content.IntentFilter;
import com.baidu.location.f;

public class e
{
  private static e d = null;
  private boolean a = false;
  private String b = null;
  private e.a c = null;
  private int e = -1;
  
  public static e a()
  {
    try
    {
      if (d == null) {
        d = new e();
      }
      e locale = d;
      return locale;
    }
    finally {}
  }
  
  public void b()
  {
    this.c = new e.a(this);
    f.b().registerReceiver(this.c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
  }
  
  public void c()
  {
    if (this.c != null) {}
    try
    {
      f.b().unregisterReceiver(this.c);
      this.c = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public String d()
  {
    return this.b;
  }
  
  public boolean e()
  {
    return this.a;
  }
  
  public int f()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */