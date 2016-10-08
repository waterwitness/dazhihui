package com.tencent.wxop.stat.b;

import java.io.File;

final class p
{
  private static int aI = -1;
  
  public static boolean a()
  {
    if (aI == 1) {
      return true;
    }
    if (aI == 0) {
      return false;
    }
    String[] arrayOfString = new String[6];
    arrayOfString[0] = "/bin";
    arrayOfString[1] = "/system/bin/";
    arrayOfString[2] = "/system/xbin/";
    arrayOfString[3] = "/system/sbin/";
    arrayOfString[4] = "/sbin/";
    arrayOfString[5] = "/vendor/bin/";
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < arrayOfString.length)
        {
          if (!new File(arrayOfString[i] + "su").exists()) {
            break label108;
          }
          aI = 1;
          return true;
        }
      }
      catch (Exception localException)
      {
        aI = 0;
        return false;
      }
      label108:
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */