package com.android.dazhihui.ui.delegate.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

class r
  extends BaseAdapter
{
  private LayoutInflater b;
  
  public r(TradeHeader paramTradeHeader, Context paramContext)
  {
    this.b = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    if (TradeHeader.h(this.a) == null) {
      return 0;
    }
    return TradeHeader.h(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    if (TradeHeader.h(this.a) == null) {
      return null;
    }
    return TradeHeader.h(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = this.b.inflate(2130903536, null);
      paramView = new s(this, null);
      paramView.a = ((LinearLayout)localView.findViewById(2131561003));
      paramView.a.setVisibility(8);
      paramView.b = ((TextView)localView.findViewById(2131560863));
      paramView.b.setVisibility(0);
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.b.setText((CharSequence)TradeHeader.h(this.a).get(paramInt));
      return localView;
      paramViewGroup = (s)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */