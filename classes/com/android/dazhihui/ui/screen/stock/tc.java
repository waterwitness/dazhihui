package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class tc
  implements lz
{
  tc(SelfStockLandScapeScreen paramSelfStockLandScapeScreen) {}
  
  public void a()
  {
    if (SelfStockLandScapeScreen.c(this.a).getSelfStockVectorSize() > 0)
    {
      this.a.a();
      return;
    }
    SelfStockLandScapeScreen.b(this.a).d();
  }
  
  public void a(int paramInt)
  {
    SelfStockLandScapeScreen.b(this.a).d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */