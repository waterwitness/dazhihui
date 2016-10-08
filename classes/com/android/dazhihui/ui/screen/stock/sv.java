package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.view.View;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.widget.IndexTopLayout;
import com.android.dazhihui.ui.widget.StockChartViewflow;

class sv
  implements wl
{
  sv(sk paramsk) {}
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if (paramInt == SystemSetingScreen.b) {}
    do
    {
      Object localObject;
      do
      {
        do
        {
          do
          {
            return;
            if (paramBoolean) {
              break;
            }
            if (sk.f(this.a).a != null) {
              sk.f(this.a).a.setVisibility(8);
            }
          } while (sk.f(this.a).b == null);
          sk.f(this.a).b.setVisibility(8);
          return;
          localObject = RightTopManager.getInstance().getData();
        } while (localObject == null);
        ((HotVideoVo)localObject).getStocklist();
        localObject = ((HotVideoVo)localObject).getShowType();
      } while ((TextUtils.isEmpty((CharSequence)localObject)) || (!((String)localObject).equals("1")));
      if (sk.f(this.a).a != null) {
        sk.f(this.a).a.setVisibility(0);
      }
    } while (sk.f(this.a).b == null);
    sk.f(this.a).b.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */