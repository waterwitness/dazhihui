package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.util.ArrayList;

public class SpecialReportVo
{
  public ArrayList<KxNewsVo.KxItem> data = new ArrayList();
  public SpecialReportVo.Header header;
  
  public static SpecialReportVo decode(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("[")) {
      str = paramString.substring(1, paramString.length() - 1);
    }
    return (SpecialReportVo)new k().a(str, SpecialReportVo.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SpecialReportVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */