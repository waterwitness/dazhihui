package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.text.TextUtils;
import java.util.Comparator;

class i
  implements Comparator<ag>
{
  i(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public int a(ag paramag1, ag paramag2)
  {
    if ((TextUtils.isEmpty(paramag1.p())) || (paramag1.p().equals("--"))) {
      return -1;
    }
    if ((TextUtils.isEmpty(paramag2.p())) || (paramag2.p().equals("--"))) {
      return 1;
    }
    return (int)(Double.valueOf(paramag2.p()).doubleValue() - Double.valueOf(paramag1.p()).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */