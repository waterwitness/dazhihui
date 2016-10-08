package com.android.dazhihui.ui.delegate.screen;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.p;
import java.util.ArrayList;

class bl
  implements p
{
  bl(EntrustSettingScreen paramEntrustSettingScreen, AdvertView paramAdvertView, TextView paramTextView) {}
  
  public void onStateChanged(int paramInt)
  {
    if (paramInt == 1) {}
    for (;;)
    {
      try
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)this.a.getAdvertData().advList.get(0);
        String str = localAdvItem.text;
        if (!TextUtils.isEmpty(localAdvItem.colour))
        {
          paramInt = Color.parseColor("#" + localAdvItem.colour);
          this.b.setTextColor(paramInt);
        }
        this.b.setText(str);
        return;
      }
      catch (Exception localException) {}
      if (paramInt == 2)
      {
        this.b.setTextColor(-13421773);
        this.b.setText("添加券商");
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */