package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class bf
  implements lz
{
  bf(EntrustNew paramEntrustNew) {}
  
  public void a()
  {
    EntrustNew.b(this.a, 20);
    EntrustNew.c(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= EntrustNew.f(this.a))
    {
      EntrustNew.g(this.a).d();
      return;
    }
    EntrustNew.b(this.a, 10);
    EntrustNew.c(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */