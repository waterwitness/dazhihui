package com.android.dazhihui.ui.delegate.screen.hk;

import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.dazhihui.ui.delegate.domain.HKMarketInfo;
import java.util.ArrayList;

class au
  implements m
{
  au(HKEntrust paramHKEntrust) {}
  
  public void a(String paramString, int paramInt)
  {
    if (HKEntrust.u(this.a) != null)
    {
      if ("A".equals(((HKMarketInfo)HKEntrust.u(this.a).get(paramInt)).getOfferType()))
      {
        HKEntrust.v(this.a).setVisibility(8);
        HKEntrust.w(this.a).setVisibility(0);
        return;
      }
      HKEntrust.v(this.a).setVisibility(0);
      HKEntrust.w(this.a).setVisibility(8);
      return;
    }
    HKEntrust.v(this.a).setVisibility(0);
    HKEntrust.w(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */