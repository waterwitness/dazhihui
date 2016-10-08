package com.android.dazhihui.ui.delegate.screen.setplan;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class d
  implements lz
{
  d(SetPlanCaptialShare paramSetPlanCaptialShare) {}
  
  public void a()
  {
    SetPlanCaptialShare.b(this.a, 20);
    SetPlanCaptialShare.c(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      SetPlanCaptialShare.i(this.a).d();
      return;
    }
    SetPlanCaptialShare.b(this.a, 10);
    SetPlanCaptialShare.c(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */