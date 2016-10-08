package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.w;

class fv
  implements b
{
  fv(fu paramfu) {}
  
  public void loginStatusChange(c paramc)
  {
    if (paramc == c.b)
    {
      if (w.a().l())
      {
        fu.a(this.a);
        fu.b(this.a);
      }
      this.a.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */