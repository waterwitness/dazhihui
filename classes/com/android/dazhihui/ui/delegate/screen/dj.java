package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

class dj
  extends BaseAdapter
{
  private LayoutInflater b;
  private String[] c;
  private int d = -1;
  
  public dj(RegionTable paramRegionTable, Context paramContext, String[] paramArrayOfString)
  {
    this.b = LayoutInflater.from(paramContext);
    this.c = paramArrayOfString;
  }
  
  public void a()
  {
    this.c = null;
    notifyDataSetChanged();
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
    notifyDataSetChanged();
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.c = paramArrayOfString;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.c != null) {
      return this.c.length;
    }
    return 0;
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
      paramView = new dk(this, null);
      paramView.b = ((RelativeLayout)localView.findViewById(2131561235));
      paramView.a = ((TextView)localView.findViewById(2131561234));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      if (this.d != paramInt) {
        break label117;
      }
      paramViewGroup.b.setBackgroundColor(-491696);
      paramViewGroup.a.setTextColor(-1);
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.c[paramInt]);
      return localView;
      paramViewGroup = (dk)paramView.getTag();
      localView = paramView;
      break;
      label117:
      paramViewGroup.b.setBackgroundColor(-1);
      paramViewGroup.a.setTextColor(-16777216);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */