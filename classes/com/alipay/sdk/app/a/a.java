package com.alipay.sdk.app.a;

import android.content.Context;
import android.text.TextUtils;

public final class a
{
  private static c a;
  
  public static void a(Context paramContext)
  {
    if (a != null) {
      return;
    }
    a = new c(paramContext);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Object localObject3;
    c localc;
    try
    {
      localObject3 = a;
      if (localObject3 == null) {}
      for (;;)
      {
        return;
        localc = a;
        if (!TextUtils.isEmpty(localc.i)) {
          break;
        }
        paramString = "";
        new Thread(new b(paramContext, paramString)).start();
        a = null;
      }
      arrayOfString1 = paramString.split("&");
    }
    finally {}
    String[] arrayOfString1;
    int i;
    if (arrayOfString1 != null)
    {
      int j = arrayOfString1.length;
      i = 0;
      paramString = null;
      label95:
      localObject2 = localObject1;
      localObject3 = paramString;
      if (i < j)
      {
        String[] arrayOfString2 = arrayOfString1[i].split("=");
        localObject2 = localObject1;
        localObject3 = paramString;
        if (arrayOfString2 == null) {
          break label376;
        }
        localObject2 = localObject1;
        localObject3 = paramString;
        if (arrayOfString2.length != 2) {
          break label376;
        }
        if (arrayOfString2[0].equalsIgnoreCase("partner"))
        {
          arrayOfString2[1].replace("\"", "");
          localObject2 = localObject1;
          localObject3 = paramString;
        }
        else if (arrayOfString2[0].equalsIgnoreCase("out_trade_no"))
        {
          localObject3 = arrayOfString2[1].replace("\"", "");
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = localObject1;
          localObject3 = paramString;
          if (arrayOfString2[0].equalsIgnoreCase("trade_no"))
          {
            localObject2 = arrayOfString2[1].replace("\"", "");
            localObject3 = paramString;
          }
        }
      }
    }
    for (;;)
    {
      paramString = c.a((String)localObject2);
      localObject1 = c.a((String)localObject3);
      localc.b = String.format("%s,%s,-,%s,-,-,-", new Object[] { paramString, localObject1, c.a((String)localObject1) });
      paramString = String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", new Object[] { localc.a, localc.b, localc.c, localc.d, localc.e, localc.f, localc.g, localc.h, localc.i, localc.j });
      break;
      label376:
      i += 1;
      localObject1 = localObject2;
      paramString = (String)localObject3;
      break label95;
      localObject3 = null;
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    if (a == null) {
      return;
    }
    a.a(paramString1, paramString2, paramString3);
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a == null) {
      return;
    }
    a.a(paramString1, paramString2, paramThrowable);
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a == null) {}
    while (paramThrowable.getClass() == null) {
      return;
    }
    a.a(paramString, paramThrowable.getClass().getSimpleName(), paramThrowable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */