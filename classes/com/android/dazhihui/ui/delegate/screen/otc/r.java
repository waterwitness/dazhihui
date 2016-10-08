package com.android.dazhihui.ui.delegate.screen.otc;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class r
  implements lz
{
  r(OtcEntrust paramOtcEntrust) {}
  
  public void a()
  {
    OtcEntrust.a(this.a, 20);
    OtcEntrust.b(this.a, 0);
    OtcEntrust.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.c)
    {
      OtcEntrust.g(this.a).d();
      return;
    }
    OtcEntrust.a(this.a, 10);
    OtcEntrust.b(this.a, paramInt);
    OtcEntrust.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */