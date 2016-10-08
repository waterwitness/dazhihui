package com.android.dazhihui.ui.delegate.screen.setplan;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class aa
  implements lz
{
  aa(SetPlanQuery paramSetPlanQuery) {}
  
  public void a()
  {
    SetPlanQuery.a(this.a, 20);
    SetPlanQuery.b(this.a, 0);
    SetPlanQuery.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.c)
    {
      SetPlanQuery.a(this.a).d();
      return;
    }
    SetPlanQuery.a(this.a, 10);
    SetPlanQuery.b(this.a, paramInt);
    SetPlanQuery.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */