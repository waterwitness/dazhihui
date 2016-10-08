package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class hc
  implements lz
{
  hc(TransferMenuNew paramTransferMenuNew) {}
  
  public void a()
  {
    TransferMenuNew.a(this.a, 20);
    TransferMenuNew.b(this.a, 0);
    if (o.l())
    {
      this.a.b(false);
      return;
    }
    if (o.m())
    {
      this.a.c(false);
      return;
    }
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.e)
    {
      TransferMenuNew.a(this.a).d();
      return;
    }
    TransferMenuNew.a(this.a, 10);
    TransferMenuNew.b(this.a, paramInt);
    if (o.l())
    {
      this.a.b(false);
      return;
    }
    if (o.m())
    {
      this.a.c(false);
      return;
    }
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */