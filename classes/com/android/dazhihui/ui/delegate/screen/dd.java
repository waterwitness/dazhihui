package com.android.dazhihui.ui.delegate.screen;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.h;

class dd
  implements AdapterView.OnItemClickListener
{
  dd(RegionTable paramRegionTable) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (RegionTable.a(this.a) == paramInt) {
      return;
    }
    RegionTable.b(this.a).a();
    RegionTable.a(this.a, paramInt);
    RegionTable.b(this.a, -1);
    RegionTable.c(this.a).setBackgroundResource(2130837588);
    RegionTable.c(this.a).setTextColor(-16777216);
    RegionTable.c(this.a).setEnabled(false);
    if ("".equals(((TextView)paramView.findViewById(2131561234)).getText().toString()))
    {
      this.a.b(0);
      return;
    }
    new Bundle().putString("region", this.a.i.a(paramInt, "1295"));
    RegionTable.a(this.a, this.a.i.a(paramInt, "1295"));
    RegionTable.d(this.a).a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */