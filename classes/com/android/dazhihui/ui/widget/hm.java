package com.android.dazhihui.ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

class hm
  extends BaseAdapter
{
  public hm(hi paramhi) {}
  
  public void a()
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (hi.d(this.a) == null) {
      return 0;
    }
    return hi.d(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return hi.d(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || ((paramView != null) && (paramView.getTag() == null)))
    {
      paramViewGroup = new hn(this, null);
      paramView = hi.c(this.a).inflate(2130903302, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131559950));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      if (paramInt < hi.d(this.a).size())
      {
        paramViewGroup.a.setText((CharSequence)hi.d(this.a).get(paramInt));
        paramViewGroup.a.setTextColor(hi.e(this.a));
      }
      paramView.setTag(paramViewGroup);
      return paramView;
      paramViewGroup = (hn)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */