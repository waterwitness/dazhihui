package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Vector;

class y
  extends BaseAdapter
{
  private View b;
  private int c = 0;
  
  public y(q paramq)
  {
    this.b = q.k(paramq).inflate(2130903503, null);
  }
  
  public View a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int getCount()
  {
    return q.g(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return q.g(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    aa localaa;
    if (paramView == null)
    {
      paramView = q.k(this.a).inflate(2130903490, null);
      localaa = new aa(this.a, null);
      localaa.a = ((TextView)paramView.findViewById(2131558890));
      localaa.b = ((TextView)paramView.findViewById(2131558891));
      localaa.c = ((TextView)paramView.findViewById(2131558892));
      localaa.d = ((TextView)paramView.findViewById(2131558893));
      localaa.e = ((TextView)paramView.findViewById(2131558994));
      localaa.f = ((TextView)paramView.findViewById(2131558996));
      localaa.h = ((ImageView)paramView.findViewById(2131558889));
      localaa.i = ((Button)paramView.findViewById(2131559608));
      localaa.g = ((TextView)paramView.findViewById(2131560782));
      localaa.g.setVisibility(0);
      paramViewGroup = new z(this.a);
      localaa.i.setOnClickListener(paramViewGroup);
      paramView.setTag(localaa);
      paramView.setTag(localaa.i.getId(), paramViewGroup);
      localaa.a.setText(((String[])q.g(this.a).get(paramInt))[0]);
      localaa.b.setText(((String[])q.g(this.a).get(paramInt))[1]);
      localaa.c.setText(((String[])q.g(this.a).get(paramInt))[2]);
      localaa.d.setText(((String[])q.g(this.a).get(paramInt))[3]);
      localaa.e.setText(((String[])q.g(this.a).get(paramInt))[4]);
      localaa.f.setText(((String[])q.g(this.a).get(paramInt))[5]);
      localaa.g.setText(bk.e(((String[])q.g(this.a).get(paramInt))[(q.b(this.a).length - 1)]));
      localaa.g.setBackgroundColor(bk.f(((String[])q.g(this.a).get(paramInt))[(q.b(this.a).length - 1)]));
      localaa.g.setVisibility(0);
      if (!((String[])q.g(this.a).get(paramInt))[6].toString().equals("0")) {
        break label655;
      }
      localaa.h.setBackgroundResource(2130839028);
    }
    for (;;)
    {
      paramViewGroup.a(paramInt);
      localaa.a.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      localaa.b.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      localaa.c.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      localaa.d.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      localaa.e.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      localaa.f.setTextColor(((Integer)q.j(this.a).get(paramInt)).intValue());
      return paramView;
      localaa = (aa)paramView.getTag();
      paramViewGroup = (z)paramView.getTag(localaa.i.getId());
      break;
      label655:
      localaa.h.setBackgroundResource(2130839074);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */