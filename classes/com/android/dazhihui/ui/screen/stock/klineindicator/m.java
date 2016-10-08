package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.android.dazhihui.ui.model.stock.StockVo;

class m
  implements RadioGroup.OnCheckedChangeListener
{
  m(SettingKlineIndicator paramSettingKlineIndicator) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (SettingKlineIndicator.a(this.a).getId() == paramInt)
    {
      StockVo.setExRights(0);
      return;
    }
    if (SettingKlineIndicator.b(this.a).getId() == paramInt)
    {
      StockVo.setExRights(1);
      return;
    }
    StockVo.setExRights(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */