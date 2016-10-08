package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.dazhihui.ui.widget.adv.ai;

class cz
  extends ai
{
  cz(DzhMainHeader paramDzhMainHeader, int paramInt)
  {
    super(paramInt);
  }
  
  public void a()
  {
    SharedPreferences localSharedPreferences = DzhMainHeader.c(this.a).getSharedPreferences("DzhPush", 0);
    this.a.e = localSharedPreferences.getInt("circlepointtotalnumber", 0);
    DzhMainHeader.b(this.a);
  }
  
  public void b()
  {
    this.a.e = 0;
    DzhMainHeader.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */