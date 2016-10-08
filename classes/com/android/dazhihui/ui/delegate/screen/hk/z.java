package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;

class z
  implements View.OnClickListener
{
  int a;
  
  z(q paramq) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if (q.l(this.b).getBoolean("HK_SETTING_TRADE_CONFIRM", true))
    {
      q.b(this.b, this.a);
      return;
    }
    q.c(this.b, this.a);
    q.i(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */