package com.alipay.c.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static Map<String, String> a(Context paramContext, Map<String, String> paramMap)
  {
    try
    {
      paramMap = com.alipay.d.a.a.a.a.a(paramMap, "appchannel", "");
      HashMap localHashMap = new HashMap();
      localHashMap.put("AA1", paramContext.getPackageName());
      com.alipay.d.a.a.b.a.a();
      localHashMap.put("AA2", com.alipay.d.a.a.b.a.a(paramContext));
      localHashMap.put("AA3", "security-sdk-token");
      localHashMap.put("AA4", "3.2.0-20160621");
      localHashMap.put("AA6", paramMap);
      return localHashMap;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */