package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.Vector;

class bl
  implements m
{
  bl(HKQuery paramHKQuery) {}
  
  public void a(String paramString, int paramInt)
  {
    HKQuery.a(this.a, paramInt);
    if (HKQuery.a(this.a) == 15058)
    {
      HKQuery.a(this.a, bk.a(HKQuery.b(this.a), 2, HKQuery.c(this.a)));
      HKQuery.b(this.a, bk.a(HKQuery.b(this.a), HKQuery.d(this.a), 2, HKQuery.c(this.a)));
    }
    for (;;)
    {
      HKQuery.f(this.a).notifyDataSetChanged();
      HKQuery.f(this.a).a().setVisibility(8);
      if (HKQuery.g(this.a).size() != 0) {
        break;
      }
      HKQuery.h(this.a).setVisibility(0);
      return;
      if (HKQuery.a(this.a) == 15060)
      {
        paramString = new Vector();
        Vector localVector = new Vector();
        paramInt = 0;
        for (;;)
        {
          if (paramInt >= HKQuery.b(this.a).size()) {
            break label252;
          }
          String str = ((String[])HKQuery.b(this.a).get(paramInt))[5];
          try
          {
            double d = Double.parseDouble(str);
            if (d != 0.0D) {
              break;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              paramString.add(HKQuery.b(this.a).get(paramInt));
              localVector.add(HKQuery.d(this.a).get(paramInt));
            }
          }
          paramInt += 1;
        }
        label252:
        HKQuery.a(this.a, bk.b(paramString, HKQuery.e(this.a).length - 1, HKQuery.c(this.a)));
        HKQuery.b(this.a, bk.b(paramString, localVector, HKQuery.e(this.a).length - 1, HKQuery.c(this.a)));
      }
      else
      {
        HKQuery.a(this.a, bk.b(HKQuery.b(this.a), HKQuery.e(this.a).length - 1, HKQuery.c(this.a)));
        HKQuery.b(this.a, bk.b(HKQuery.b(this.a), HKQuery.d(this.a), HKQuery.e(this.a).length - 1, HKQuery.c(this.a)));
      }
    }
    HKQuery.h(this.a).setVisibility(8);
    HKQuery.i(this.a).setSelection(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */