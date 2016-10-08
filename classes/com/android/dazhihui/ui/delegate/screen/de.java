package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.TextView;

class de
  implements AdapterView.OnItemClickListener
{
  de(RegionTable paramRegionTable) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (RegionTable.e(this.a) == paramInt) {
      return;
    }
    RegionTable.b(this.a, paramInt);
    RegionTable.c(this.a).setBackgroundResource(2130837582);
    RegionTable.c(this.a).setTextColor(-1);
    RegionTable.c(this.a).setEnabled(true);
    RegionTable.a(this.a, (TextView)paramView.findViewById(2131561234));
    RegionTable.b(this.a, RegionTable.f(this.a).getText().toString());
    if ("".equals(RegionTable.g(this.a)))
    {
      this.a.b(0);
      return;
    }
    this.a.a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */