package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class bv
  implements lz
{
  bv(EntrustTable_history paramEntrustTable_history) {}
  
  public void a()
  {
    EntrustTable_history.a(this.a, 20);
    EntrustTable_history.b(this.a, 0);
    if (EntrustTable_history.b(this.a).equals("fundDeledate"))
    {
      this.a.b(false);
      return;
    }
    if (EntrustTable_history.b(this.a).equals("tradeHistory"))
    {
      this.a.c(false);
      return;
    }
    this.a.d(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      EntrustTable_history.a(this.a).d();
      return;
    }
    EntrustTable_history.a(this.a, 10);
    EntrustTable_history.b(this.a, paramInt);
    if (EntrustTable_history.b(this.a).equals("fundDeledate"))
    {
      this.a.b(false);
      return;
    }
    if (EntrustTable_history.b(this.a).equals("tradeHistory"))
    {
      this.a.c(false);
      return;
    }
    this.a.d(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */