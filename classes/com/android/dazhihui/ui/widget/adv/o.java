package com.android.dazhihui.ui.widget.adv;

import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import java.util.ArrayList;

class o
  implements ag
{
  o(AdvertView paramAdvertView) {}
  
  public void a(RTBAdvertResultVo paramRTBAdvertResultVo)
  {
    int i;
    if ((paramRTBAdvertResultVo != null) && (AdvertView.a(this.a).advList != null))
    {
      i = 0;
      if (i >= AdvertView.a(this.a).advList.size()) {
        break label183;
      }
      if (((AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(i)).img.indexOf(paramRTBAdvertResultVo.curl) <= -1) {}
    }
    for (;;)
    {
      if (i > -1)
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(i);
        AdvertView.a(this.a).advList.clear();
        AdvertView.a(this.a).advList.add(localAdvItem);
        AdvertView.a(this.a, paramRTBAdvertResultVo);
        AdvertView.b(this.a, AdvertView.a(this.a));
        return;
        i += 1;
        break;
      }
      this.a.c();
      AdvertView.a(this.a, null);
      return;
      this.a.c();
      AdvertView.a(this.a, null);
      return;
      label183:
      i = -1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */