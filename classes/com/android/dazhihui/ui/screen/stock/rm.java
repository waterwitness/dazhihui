package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.CompoundButton;
import com.android.dazhihui.ui.widget.dd;

class rm
  implements dd
{
  rm(SearchStockScreen paramSearchStockScreen) {}
  
  public void a(CompoundButton paramCompoundButton, int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 0) && (paramBoolean))
    {
      this.a.b.setVisibility(0);
      this.a.c.setVisibility(8);
      this.a.d.setVisibility(8);
      this.a.a(Boolean.valueOf(false), SearchStockScreen.a(this.a));
    }
    do
    {
      return;
      if ((paramInt == 1) && (paramBoolean))
      {
        this.a.b.setVisibility(8);
        this.a.c.setVisibility(0);
        this.a.d.setVisibility(8);
        this.a.a(Boolean.valueOf(true), SearchStockScreen.a(this.a));
        return;
      }
    } while ((paramInt != 2) || (!paramBoolean));
    this.a.b.setVisibility(8);
    this.a.c.setVisibility(8);
    this.a.d.setVisibility(0);
    this.a.a(Boolean.valueOf(false), SearchStockScreen.a(this.a));
    this.a.f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */