package com.android.dazhihui.ui.widget;

import android.view.View;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import java.util.ArrayList;

class fm
  implements Runnable
{
  fm(IndexTopLayout paramIndexTopLayout) {}
  
  public void run()
  {
    if (IndexTopLayout.a(this.a) != null)
    {
      HotVideoVo localHotVideoVo = RightTopManager.getInstance().getData();
      if (localHotVideoVo != null)
      {
        ArrayList localArrayList = localHotVideoVo.getStocklist();
        if ((localArrayList == null) || (localArrayList.size() <= 0)) {
          break label61;
        }
        IndexTopLayout.a(this.a, localHotVideoVo);
        this.a.a(IndexTopLayout.f(this.a));
      }
    }
    return;
    label61:
    this.a.a.setVisibility(8);
    this.a.b.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */