package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

class dl
  extends BaseAdapter
{
  private LayoutInflater b;
  private String[] c;
  private int d = -1;
  
  public dl(RegionTable paramRegionTable, Context paramContext, String[] paramArrayOfString)
  {
    this.b = LayoutInflater.from(paramContext);
    this.c = paramArrayOfString;
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
      paramView = new dm(this, null);
      paramView.a = ((RelativeLayout)localView.findViewById(2131561235));
      paramView.b = ((TextView)localView.findViewById(2131561234));
      paramView.c = ((ImageView)localView.findViewById(2131561236));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      if (this.d != paramInt) {
        break label139;
      }
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.a.setBackgroundColor(-491696);
      paramViewGroup.b.setTextColor(-1);
    }
    for (;;)
    {
      paramViewGroup.b.setText(this.c[paramInt]);
      return localView;
      paramViewGroup = (dm)paramView.getTag();
      localView = paramView;
      break;
      label139:
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.a.setBackgroundColor(-1);
      paramViewGroup.b.setTextColor(-16777216);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */