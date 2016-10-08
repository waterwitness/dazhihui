package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class gz
  extends BaseAdapter
{
  private LayoutInflater b;
  private String[] c;
  
  public gz(TransferMenu paramTransferMenu, Context paramContext, String[] paramArrayOfString)
  {
    this.b = LayoutInflater.from(paramContext);
    this.c = paramArrayOfString;
  }
  
  public int getCount()
  {
    return this.c.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.c[paramInt];
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
      localView = this.b.inflate(2130903559, null);
      paramView = new ha(this);
      paramView.a = ((TextView)localView.findViewById(2131561234));
      paramView.b = ((ImageView)localView.findViewById(2131561236));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.c[paramInt]);
      return localView;
      paramViewGroup = (ha)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */