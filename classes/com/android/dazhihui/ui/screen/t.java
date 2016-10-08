package com.android.dazhihui.ui.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.android.dazhihui.ui.widget.adv.ad;
import java.util.Iterator;
import java.util.List;

class t
  implements View.OnClickListener
{
  t(InitScreen paramInitScreen) {}
  
  public void onClick(View paramView)
  {
    String str;
    if (InitScreen.c(this.a) != null)
    {
      paramView = InitScreen.c(this.a).advItem.callurl;
      str = InitScreen.c(this.a).advItem.countid;
      if ((paramView != null) && (!paramView.isEmpty()) && (!paramView.equals("0"))) {}
    }
    else
    {
      return;
    }
    if ((InitScreen.c(this.a).advData.isDSP) && (InitScreen.e(this.a) != null) && (InitScreen.e(this.a).clktracks != null))
    {
      Iterator localIterator = InitScreen.e(this.a).clktracks.iterator();
      while (localIterator.hasNext()) {
        ad.a((String)localIterator.next());
      }
    }
    InitScreen.b(this.a).removeCallbacks(InitScreen.f(this.a));
    r.a(paramView, this.a, str, null);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */