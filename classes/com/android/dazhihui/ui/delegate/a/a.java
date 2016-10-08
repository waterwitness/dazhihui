package com.android.dazhihui.ui.delegate.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class a
  extends BaseAdapter
{
  private LayoutInflater a;
  private String[] b;
  
  public a(Context paramContext, String[] paramArrayOfString)
  {
    this.a = LayoutInflater.from(paramContext);
    this.b = paramArrayOfString;
  }
  
  public int getCount()
  {
    return this.b.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.b[paramInt];
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
      localView = this.a.inflate(2130903557, null);
      paramView = new c(this, null);
      paramView.a = ((TextView)localView.findViewById(2131561234));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.b[paramInt]);
      return localView;
      paramViewGroup = (c)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */