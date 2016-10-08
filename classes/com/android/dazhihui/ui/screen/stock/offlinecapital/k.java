package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

class k
  extends BaseAdapter
{
  k(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public int getCount()
  {
    if (OfflineCapitalDetailActivity.b(this.a) == 1) {
      return OfflineCapitalDetailActivity.a.length;
    }
    if (OfflineCapitalDetailActivity.b(this.a) == 2) {
      return OfflineCapitalDetailActivity.b.length;
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (OfflineCapitalDetailActivity.b(this.a) == 1) {
      return OfflineCapitalDetailActivity.a[paramInt];
    }
    if (OfflineCapitalDetailActivity.b(this.a) == 2) {
      return OfflineCapitalDetailActivity.b[paramInt];
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(this.a).inflate(2130903350, null);
    }
    paramView = (TextView)paramViewGroup.findViewById(2131560126);
    if (OfflineCapitalDetailActivity.b(this.a) == 1) {
      paramView.setText(OfflineCapitalDetailActivity.a[paramInt]);
    }
    while (OfflineCapitalDetailActivity.m(this.a) == y.b)
    {
      paramView.setTextColor(-14540254);
      return paramViewGroup;
      if (OfflineCapitalDetailActivity.b(this.a) == 2) {
        paramView.setText(OfflineCapitalDetailActivity.b[paramInt]);
      }
    }
    paramView.setTextColor(-5395027);
    return paramViewGroup;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */