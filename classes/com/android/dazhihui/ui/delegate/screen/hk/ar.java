package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.android.dazhihui.ui.widget.gr;

class ar
  implements View.OnFocusChangeListener
{
  ar(HKEntrust paramHKEntrust) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      HKEntrust.t(this.a).b();
      return;
    }
    HKEntrust.t(this.a).c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */