package com.android.dazhihui.ui.delegate.screen;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;

class fa
  implements View.OnClickListener
{
  fa(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    n.a("", 1336);
    if (!TextUtils.isEmpty(dy.c(this.a))) {
      r.a(dy.c(this.a), this.a.getActivity(), null, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */