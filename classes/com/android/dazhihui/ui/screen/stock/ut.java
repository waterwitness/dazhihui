package com.android.dazhihui.ui.screen.stock;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class ut
  extends BaseAdapter
{
  private ut(SettingThirdScreen paramSettingThirdScreen) {}
  
  public int getCount()
  {
    if (SettingThirdScreen.c(this.a) == null) {
      return 0;
    }
    return SettingThirdScreen.c(this.a).length;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = null;
    if (paramView == null) {
      if (SettingThirdScreen.d(this.a) == 2)
      {
        paramView = this.a.getLayoutInflater().inflate(2130903427, null);
        paramViewGroup = new uu(this);
        uu.a(paramViewGroup, (TextView)paramView.findViewById(2131560446));
        paramView.setTag(paramViewGroup);
      }
    }
    for (;;)
    {
      uu.a(paramViewGroup).setText(SettingThirdScreen.c(this.a)[paramInt]);
      return paramView;
      paramViewGroup = (uu)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */