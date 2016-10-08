package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class u
  implements lz
{
  u(CapitalandHoldingTable paramCapitalandHoldingTable) {}
  
  public void a()
  {
    CapitalandHoldingTable.b(this.a, 20);
    CapitalandHoldingTable.c(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      CapitalandHoldingTable.i(this.a).d();
      return;
    }
    CapitalandHoldingTable.b(this.a, 10);
    CapitalandHoldingTable.c(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */