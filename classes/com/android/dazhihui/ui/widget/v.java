package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.widget.flip.f;
import java.util.ArrayList;

class v
  implements f
{
  v(o paramo, TextView paramTextView) {}
  
  public void a(View paramView, int paramInt)
  {
    if ((a.c().b() != null) && (a.c().b().getAdvert(138) != null) && (a.c().b().getAdvert(138).advList.size() > paramInt) && (paramInt > -1))
    {
      paramView = ((AdvertVo.AdvItem)a.c().b().getAdvert(138).advList.get(paramInt)).text;
      this.a.setText(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */