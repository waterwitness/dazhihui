package com.android.dazhihui.ui.delegate.screen;

import android.support.v4.view.df;
import com.android.dazhihui.ui.delegate.b.o;

class hf
  implements df
{
  hf(TransferMenuNew paramTransferMenuNew) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    this.a.a(paramInt);
    TransferMenuNew.b(this.a);
    if (paramInt == 0) {
      if (o.l())
      {
        this.a.d();
        TransferMenuNew.c(this.a, paramInt);
      }
    }
    do
    {
      return;
      if (o.m())
      {
        this.a.f();
        break;
      }
      this.a.c();
      break;
      if (paramInt == 2)
      {
        TransferMenuNew.c(this.a);
        if (o.l())
        {
          this.a.b(true);
          return;
        }
        if (o.m())
        {
          this.a.c(true);
          return;
        }
        this.a.a(true);
        return;
      }
    } while (paramInt != 1);
    if (o.l()) {
      this.a.d();
    }
    for (;;)
    {
      TransferMenuNew.c(this.a, paramInt);
      if (!o.l()) {
        break;
      }
      this.a.h();
      return;
      if (o.m()) {
        this.a.f();
      } else {
        this.a.c();
      }
    }
    if (o.m())
    {
      this.a.i();
      return;
    }
    this.a.g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */