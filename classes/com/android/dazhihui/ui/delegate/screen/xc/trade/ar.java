package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import java.util.Vector;

class ar
  extends BaseAdapter
{
  private View b;
  private int c = 0;
  
  public ar(af paramaf)
  {
    this.b = af.n(paramaf).inflate(2130903503, null);
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
    return af.k(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return af.k(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    at localat;
    if (paramView == null)
    {
      paramView = af.n(this.a).inflate(2130903467, null);
      localat = new at(this.a, null);
      localat.a = ((TextView)paramView.findViewById(2131558890));
      localat.b = ((TextView)paramView.findViewById(2131558891));
      localat.c = ((TextView)paramView.findViewById(2131558892));
      localat.d = ((TextView)paramView.findViewById(2131558893));
      localat.e = ((TextView)paramView.findViewById(2131558994));
      localat.f = ((TextView)paramView.findViewById(2131558996));
      localat.g = ((ImageView)paramView.findViewById(2131558889));
      localat.h = ((Button)paramView.findViewById(2131559608));
      paramViewGroup = new as(this.a);
      localat.h.setOnClickListener(paramViewGroup);
      paramView.setTag(localat);
      paramView.setTag(localat.h.getId(), paramViewGroup);
      localat.a.setText(((String[])af.k(this.a).get(paramInt))[0]);
      localat.b.setText(((String[])af.k(this.a).get(paramInt))[1]);
      localat.c.setText(((String[])af.k(this.a).get(paramInt))[2]);
      localat.d.setText(((String[])af.k(this.a).get(paramInt))[3]);
      localat.e.setText(((String[])af.k(this.a).get(paramInt))[4]);
      localat.f.setText(((String[])af.k(this.a).get(paramInt))[5]);
      if (!o.l()) {
        break label570;
      }
      if (!((String[])af.j(this.a).get(paramInt))[7].toString().equals("1")) {
        break label557;
      }
      localat.g.setBackgroundResource(2130839028);
    }
    for (;;)
    {
      paramViewGroup.a(paramInt);
      localat.a.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      localat.b.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      localat.c.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      localat.d.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      localat.e.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      localat.f.setTextColor(((Integer)af.l(this.a).get(paramInt)).intValue());
      return paramView;
      localat = (at)paramView.getTag();
      paramViewGroup = (as)paramView.getTag(localat.h.getId());
      break;
      label557:
      localat.g.setBackgroundResource(2130839074);
      continue;
      label570:
      if (o.m())
      {
        if (((String[])af.j(this.a).get(paramInt))[6].toString().equals("0B")) {
          localat.g.setBackgroundResource(2130839028);
        } else {
          localat.g.setBackgroundResource(2130839074);
        }
      }
      else if (((String[])af.j(this.a).get(paramInt))[7].toString().equals("0")) {
        localat.g.setBackgroundResource(2130839028);
      } else {
        localat.g.setBackgroundResource(2130839074);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */