package com.android.dazhihui.ui.delegate.screen.otc;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class z
  implements lz
{
  z(OtcQuery paramOtcQuery) {}
  
  public void a()
  {
    OtcQuery.a(this.a, 20);
    OtcQuery.b(this.a, 0);
    OtcQuery.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.c)
    {
      OtcQuery.a(this.a).d();
      return;
    }
    OtcQuery.a(this.a, 10);
    OtcQuery.b(this.a, paramInt);
    OtcQuery.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */