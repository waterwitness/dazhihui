package com.android.dazhihui.ui.delegate.screen.otc;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class d
  implements lz
{
  d(OtcCaptialShare paramOtcCaptialShare) {}
  
  public void a()
  {
    OtcCaptialShare.b(this.a, 20);
    OtcCaptialShare.c(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      OtcCaptialShare.i(this.a).d();
      return;
    }
    OtcCaptialShare.b(this.a, 10);
    OtcCaptialShare.c(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */