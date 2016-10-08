package com.baidu.location.e;

import android.os.HandlerThread;

public class x
{
  private static HandlerThread a = null;
  
  public static HandlerThread a()
  {
    if (a == null)
    {
      a = new HandlerThread("ServiceStartArguments", 10);
      a.start();
    }
    return a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */