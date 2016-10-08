package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class l
  implements lz
{
  l(CancelTable paramCancelTable) {}
  
  public void a()
  {
    CancelTable.a(this.a, 20);
    CancelTable.b(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      CancelTable.a(this.a).d();
      return;
    }
    CancelTable.a(this.a, 10);
    CancelTable.b(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */