package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class ht
  implements lz
{
  ht(Transfertable_select paramTransfertable_select) {}
  
  public void a()
  {
    Transfertable_select.a(this.a, 20);
    Transfertable_select.b(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      Transfertable_select.a(this.a).d();
      return;
    }
    Transfertable_select.a(this.a, 10);
    Transfertable_select.b(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */