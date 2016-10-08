package com.h.a.a.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Random;

public class g
{
  public static final String a()
  {
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = (int)System.nanoTime();
    int k = new Random().nextInt();
    int m = new Random().nextInt();
    byte[] arrayOfByte1 = f.a(i);
    byte[] arrayOfByte2 = f.a(j);
    byte[] arrayOfByte3 = f.a(k);
    byte[] arrayOfByte4 = f.a(m);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 0, 4);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, 4, 4);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte5, 8, 4);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, 12, 4);
    return b.b(arrayOfByte5, 2);
  }
  
  public static String a(Context paramContext)
  {
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext == null) {
          break label44;
        }
        paramContext = paramContext.getDeviceId();
      }
      catch (Exception paramContext)
      {
        Object localObject;
        paramContext = null;
        continue;
      }
      localObject = paramContext;
      if (h.a(paramContext)) {
        localObject = a();
      }
      return (String)localObject;
      label44:
      paramContext = null;
    }
  }
  
  public static String b(Context paramContext)
  {
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext == null) {
          break label44;
        }
        paramContext = paramContext.getSubscriberId();
      }
      catch (Exception paramContext)
      {
        Object localObject;
        paramContext = null;
        continue;
      }
      localObject = paramContext;
      if (h.a(paramContext)) {
        localObject = a();
      }
      return (String)localObject;
      label44:
      paramContext = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */