package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class d
  extends BaseAdapter
{
  public d(DropDownCurrencyView paramDropDownCurrencyView) {}
  
  public int getCount()
  {
    if ((DropDownCurrencyView.d(this.a) == null) || (DropDownCurrencyView.d(this.a).length < 1)) {
      return 0;
    }
    return DropDownCurrencyView.d(this.a).length;
  }
  
  public Object getItem(int paramInt)
  {
    if ((DropDownCurrencyView.d(this.a) == null) || (DropDownCurrencyView.d(this.a).length < 1)) {
      return null;
    }
    return DropDownCurrencyView.d(this.a)[paramInt];
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
      localView = LayoutInflater.from(DropDownCurrencyView.g(this.a)).inflate(2130903097, null);
      paramView = new e(this);
      paramView.a = ((TextView)localView.findViewById(2131558565));
      paramView.b = ((ImageView)localView.findViewById(2131558564));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText(DropDownCurrencyView.d(this.a)[paramInt]);
      paramViewGroup.b.setVisibility(8);
      return localView;
      paramViewGroup = (e)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */