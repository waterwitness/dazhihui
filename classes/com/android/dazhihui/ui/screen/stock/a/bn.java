package com.android.dazhihui.ui.screen.stock.a;

import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class bn
  implements lz
{
  bn(bl parambl) {}
  
  public void a()
  {
    if (bl.b(this.a).getSelfStockVectorSize() > 0)
    {
      this.a.refresh();
      return;
    }
    bl.a(this.a).d();
  }
  
  public void a(int paramInt)
  {
    bl.a(this.a).d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */