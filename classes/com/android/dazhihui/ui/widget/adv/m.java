package com.android.dazhihui.ui.widget.adv;

import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.c.a.k;
import java.util.ArrayList;

class m
  implements ag
{
  m(AdvertView paramAdvertView) {}
  
  public void a(RTBAdvertResultVo paramRTBAdvertResultVo)
  {
    try
    {
      Object localObject1 = a.c().b().getAdvert(this.a.a);
      if ((paramRTBAdvertResultVo != null) && (localObject1 != null) && (((AdvertVo.AdvertData)localObject1).advList != null))
      {
        i = 0;
        if (i >= ((AdvertVo.AdvertData)localObject1).advList.size()) {
          break label187;
        }
        if (((AdvertVo.AdvItem)((AdvertVo.AdvertData)localObject1).advList.get(i)).img.indexOf(paramRTBAdvertResultVo.curl) <= -1) {
          break label178;
        }
        if (i > -1)
        {
          AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)((AdvertVo.AdvertData)localObject1).advList.get(i);
          k localk = new k();
          localObject1 = localk.a(localObject1);
          AdvertView.a(this.a, (AdvertVo.AdvertData)localk.a((String)localObject1, AdvertVo.AdvertData.class));
          AdvertView.a(this.a).advList.clear();
          AdvertView.a(this.a).advList.add(localAdvItem);
          AdvertView.a(this.a, paramRTBAdvertResultVo);
          AdvertView.h(this.a);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
        continue;
        label178:
        i += 1;
        continue;
        label187:
        int i = -1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */