package com.android.dazhihui.ui.delegate.screen.ggt;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class d
  implements lz
{
  d(GgtCaptialHolding paramGgtCaptialHolding) {}
  
  public void a()
  {
    GgtCaptialHolding.b(this.a, 20);
    GgtCaptialHolding.c(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      GgtCaptialHolding.i(this.a).d();
      return;
    }
    GgtCaptialHolding.b(this.a, 10);
    GgtCaptialHolding.c(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */