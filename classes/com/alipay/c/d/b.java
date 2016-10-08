package com.alipay.c.d;

import android.content.Context;
import com.alipay.c.f.h;
import com.alipay.d.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  public static Map<String, String> a(Context paramContext, Map<String, String> paramMap)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      String str1 = a.a(paramMap, "tid", "");
      String str2 = a.a(paramMap, "utdid", "");
      String str3 = a.a(paramMap, "userId", "");
      String str4 = a.a(paramMap, "appName", "");
      String str5 = a.a(paramMap, "appKeyClient", "");
      paramMap = a.a(paramMap, "tmxSessionId", "");
      paramContext = h.c(paramContext);
      localHashMap.put("AC1", str1);
      localHashMap.put("AC2", str2);
      localHashMap.put("AC3", "");
      localHashMap.put("AC4", paramContext);
      localHashMap.put("AC5", str3);
      localHashMap.put("AC6", paramMap);
      localHashMap.put("AC7", "");
      localHashMap.put("AC8", str4);
      localHashMap.put("AC9", str5);
      return localHashMap;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */