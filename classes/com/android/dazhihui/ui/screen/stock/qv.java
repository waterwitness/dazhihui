package com.android.dazhihui.ui.screen.stock;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class qv
  extends BaseAdapter
{
  qw a;
  
  public qv(SearchHuiFragment paramSearchHuiFragment) {}
  
  public int getCount()
  {
    if (SearchHuiFragment.a(this.b) != null) {
      return SearchHuiFragment.a(this.b).size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (SearchHuiFragment.a(this.b) != null) {
      return SearchHuiFragment.a(this.b).get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      this.a = new qw(this);
      paramView = LayoutInflater.from(this.b.getContext()).inflate(2130903398, paramViewGroup, false);
      this.a.a = ((LinearLayout)paramView.findViewById(2131560286));
      this.a.b = ((TextView)paramView.findViewById(2131558624));
      paramView.setTag(this.a);
    }
    for (;;)
    {
      this.a.b.setText((CharSequence)SearchHuiFragment.a(this.b).get(paramInt));
      switch (qm.a[SearchHuiFragment.k(this.b).ordinal()])
      {
      default: 
        return paramView;
        this.a = ((qw)paramView.getTag());
      }
    }
    this.a.b.setTextColor(Color.parseColor("#222222"));
    this.a.a.setBackgroundResource(2130838818);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */