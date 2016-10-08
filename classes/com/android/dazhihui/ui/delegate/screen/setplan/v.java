package com.android.dazhihui.ui.delegate.screen.setplan;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class v
  implements lz
{
  v(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void a()
  {
    SetPlanEntrust.c(this.a, 20);
    SetPlanEntrust.d(this.a, 0);
    SetPlanEntrust.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.c)
    {
      SetPlanEntrust.k(this.a).d();
      return;
    }
    SetPlanEntrust.c(this.a, 10);
    SetPlanEntrust.d(this.a, paramInt);
    SetPlanEntrust.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */