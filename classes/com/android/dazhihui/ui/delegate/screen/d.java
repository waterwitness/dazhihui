package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class d
  implements lz
{
  d(BargainTable_history paramBargainTable_history) {}
  
  public void a()
  {
    BargainTable_history.a(this.a, 20);
    BargainTable_history.b(this.a, 0);
    this.a.b(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      BargainTable_history.a(this.a).d();
      return;
    }
    BargainTable_history.a(this.a, 10);
    BargainTable_history.b(this.a, paramInt);
    this.a.b(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */