package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

class qi
  implements AdapterView.OnItemClickListener
{
  qi(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < SearchHuiFragment.a(this.a).size())
    {
      paramAdapterView = ((String)SearchHuiFragment.a(this.a).get(paramInt)).toString();
      SearchHuiFragment.a(this.a, paramAdapterView, 0, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */