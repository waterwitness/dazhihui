package com.android.dazhihui.ui.delegate.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.dazhihui.ui.delegate.screen.ggt.CustomTextView;
import java.util.ArrayList;

class p
  extends BaseAdapter
{
  private LayoutInflater b;
  
  public p(TradeHeader paramTradeHeader, Context paramContext)
  {
    this.b = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    if (TradeHeader.e(this.a) == null) {
      return 0;
    }
    return TradeHeader.e(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    if (TradeHeader.e(this.a) == null) {
      return null;
    }
    return TradeHeader.e(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903536, null);
      paramViewGroup = new q(this, null);
      paramViewGroup.a = ((CustomTextView)paramView.findViewById(2131560714));
      paramViewGroup.b = ((CustomTextView)paramView.findViewById(2131561004));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a.setText(((t)TradeHeader.e(this.a).get(paramInt)).a());
      paramViewGroup.b.setText(((t)TradeHeader.e(this.a).get(paramInt)).b());
      return paramView;
      paramViewGroup = (q)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */