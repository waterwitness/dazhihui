package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class th
  extends s
{
  th(SetPwdScreen paramSetPwdScreen, i parami)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    if (SetPwdScreen.a(this.a))
    {
      SetPwdScreen.b(this.a);
      return;
    }
    if (SetPwdScreen.c(this.a))
    {
      SetPwdScreen.d(this.a);
      return;
    }
    if (SetPwdScreen.e(this.a))
    {
      SetPwdScreen.f(this.a);
      return;
    }
    SetPwdScreen.g(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */