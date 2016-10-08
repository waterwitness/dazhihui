package com.alipay.f.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class a
{
  public static String a(Context paramContext, Map<String, String> paramMap)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("utdid", com.alipay.d.a.a.a.a.a(paramMap, "utdid", ""));
      localHashMap.put("tid", com.alipay.d.a.a.a.a.a(paramMap, "tid", ""));
      localHashMap.put("userId", com.alipay.d.a.a.a.a.a(paramMap, "userId", ""));
      com.alipay.c.g.a.a(paramContext).a(0, localHashMap, null);
      paramContext = com.alipay.c.a.a.a(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */