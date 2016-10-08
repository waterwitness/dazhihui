package com.android.dazhihui.ui.screen;

import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.ag;
import java.util.ArrayList;

class s
  implements ag
{
  s(InitScreen paramInitScreen, AdvertVo.AdvertData paramAdvertData) {}
  
  public void a(RTBAdvertResultVo paramRTBAdvertResultVo)
  {
    if (this.b.isFinishing()) {
      return;
    }
    int i;
    if ((paramRTBAdvertResultVo != null) && (this.a.advList != null))
    {
      i = 0;
      if (i >= this.a.advList.size()) {
        break label267;
      }
      if (((AdvertVo.AdvItem)this.a.advList.get(i)).img.indexOf(paramRTBAdvertResultVo.curl) <= -1) {}
    }
    for (;;)
    {
      if (i > -1)
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)this.a.advList.get(i);
        Object localObject = localAdvItem.getMatchImg()[0];
        localObject = r.a(this.b).a((String)localObject);
        if (localObject != null)
        {
          InitScreen.a(this.b, paramRTBAdvertResultVo);
          InitScreen.a(this.b, new AdvertVo.AdvertBitmap());
          InitScreen.c(this.b).advData = this.a;
          InitScreen.c(this.b).advItem = localAdvItem;
          InitScreen.c(this.b).bytes = ((byte[])localObject);
        }
        for (;;)
        {
          InitScreen.d(this.b);
          return;
          i += 1;
          break;
          InitScreen.a(this.b, a.c().a(499, false));
        }
      }
      InitScreen.a(this.b, a.c().a(499, false));
      InitScreen.d(this.b);
      return;
      InitScreen.a(this.b, a.c().a(499, false));
      InitScreen.d(this.b);
      return;
      label267:
      i = -1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */