package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class qa
  implements lz
{
  qa(RecentBrowseStockScreen paramRecentBrowseStockScreen) {}
  
  public void a()
  {
    if (RecentBrowseStockScreen.c(this.a).getSelfStockVectorSize() > 0)
    {
      RecentBrowseStockScreen.d(this.a).a();
      this.a.a();
      return;
    }
    RecentBrowseStockScreen.b(this.a).d();
  }
  
  public void a(int paramInt)
  {
    RecentBrowseStockScreen.b(this.a).d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */