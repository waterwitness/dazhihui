package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.c.b;

class bg
  extends BaseAdapter
{
  private b[] b;
  
  bg(bb parambb) {}
  
  public void a(b[] paramArrayOfb)
  {
    this.b = paramArrayOfb;
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
      localView = bb.b(this.a).inflate(2130903260, null);
      paramView = new bj(this.a);
      paramView.a = ((TextView)localView.findViewById(2131559105));
      paramView.b = ((ImageView)localView.findViewById(2131559765));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.b[paramInt].a);
      paramViewGroup.a.setTag(this.b[paramInt]);
      paramViewGroup.b.setVisibility(8);
      return localView;
      paramViewGroup = (bj)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */