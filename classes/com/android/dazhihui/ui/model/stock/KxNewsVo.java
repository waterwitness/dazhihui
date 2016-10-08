package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.util.ArrayList;

public class KxNewsVo
{
  public ArrayList<KxNewsVo.KxItem> data = new ArrayList();
  public KxNewsVo.Header header = new KxNewsVo.Header();
  
  public static KxNewsVo decode(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("[")) {
      str = paramString.substring(1, paramString.length() - 1);
    }
    return (KxNewsVo)new k().a(str, KxNewsVo.class);
  }
  
  public static String getRequest(String paramString)
  {
    return "[{\"header\":{\"service\":\"110\"},\"data\":{\"key\":\"1100002/" + paramString + "\"}}]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\KxNewsVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */