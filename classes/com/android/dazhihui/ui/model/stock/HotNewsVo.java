package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.net.URLEncoder;

public class HotNewsVo
{
  public HotNewsVo.Data data;
  public HotNewsVo.Header header;
  
  public static HotNewsVo decode(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("[")) {
      str = paramString.substring(1, paramString.length() - 1);
    }
    return (HotNewsVo)new k().a(str, HotNewsVo.class);
  }
  
  public static String getRequest(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = URLEncoder.encode(paramString2, "utf-8");
      paramString2 = str;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    paramString1 = new HotNewsVo.NewsRequestHot(paramString1, paramString2, paramString3);
    paramString1 = new k().a(paramString1);
    return "[" + paramString1 + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HotNewsVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */