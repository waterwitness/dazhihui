package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;

class kr
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  kr(ju paramju) {}
  
  public void onGlobalLayout()
  {
    if (ju.a(this.a).getHeight() < this.a.l)
    {
      this.a.j.setVisibility(0);
      this.a.m.setVisibility(0);
      return;
    }
    if (this.a.d.getVisibility() == 0)
    {
      this.a.j.setVisibility(0);
      this.a.m.setVisibility(0);
      return;
    }
    this.a.j.setVisibility(8);
    this.a.m.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */