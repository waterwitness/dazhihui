package com.android.dazhihui.ui.delegate.screen.margin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;

class bk
  extends BaseAdapter
{
  private b[] b;
  
  bk(bi parambi) {}
  
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
      localView = bi.a(this.a).inflate(2130903260, null);
      paramView = new bn(this.a);
      paramView.a = ((TextView)localView.findViewById(2131559105));
      paramView.b = ((TextView)localView.findViewById(2131559764));
      paramView.c = ((ImageView)localView.findViewById(2131559765));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.b[paramInt].a);
      paramViewGroup.a.setTag(this.b[paramInt]);
      if ((!this.b[paramInt].b.contains("31100")) || (o.t <= 0)) {
        break;
      }
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.b.setText("今日有" + o.t + "只新股可以申购");
      return localView;
      paramViewGroup = (bn)paramView.getTag();
      localView = paramView;
    }
    paramViewGroup.c.setVisibility(8);
    paramViewGroup.b.setVisibility(8);
    return localView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */