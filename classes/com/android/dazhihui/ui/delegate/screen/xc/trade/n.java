package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Vector;

class n
  extends BaseAdapter
{
  private int b;
  private LayoutInflater c;
  
  public n(a parama, Context paramContext)
  {
    this.c = LayoutInflater.from(paramContext);
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int getCount()
  {
    return a.i(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return a.i(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    o localo;
    if (paramView == null)
    {
      localo = new o(this);
      paramView = this.c.inflate(2130903593, null);
      localo.i = ((LinearLayout)paramView.findViewById(2131560807));
      localo.a = ((TextView)paramView.findViewById(2131560809));
      localo.b = ((TextView)paramView.findViewById(2131560810));
      localo.c = ((TextView)paramView.findViewById(2131560812));
      localo.d = ((TextView)paramView.findViewById(2131560813));
      localo.e = ((TextView)paramView.findViewById(2131560815));
      localo.f = ((TextView)paramView.findViewById(2131560816));
      localo.g = ((TextView)paramView.findViewById(2131560819));
      localo.h = ((TextView)paramView.findViewById(2131560820));
      localo.j = ((LinearLayout)paramView.findViewById(2131559736));
      localo.k = ((LinearLayout)paramView.findViewById(2131560711));
      localo.l = ((LinearLayout)paramView.findViewById(2131560712));
      localo.m = ((LinearLayout)paramView.findViewById(2131560713));
      paramViewGroup = new p(this.a);
      localo.i.setOnClickListener(paramViewGroup);
      localo.k.setOnClickListener(paramViewGroup);
      localo.l.setOnClickListener(paramViewGroup);
      localo.m.setOnClickListener(paramViewGroup);
      paramView.setTag(localo);
      paramView.setTag(localo.j.getId(), paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a(paramInt);
      localo.a.setText(((String[])a.i(this.a).get(paramInt))[0]);
      localo.b.setText(((String[])a.i(this.a).get(paramInt))[1]);
      localo.c.setText(((String[])a.i(this.a).get(paramInt))[2]);
      localo.d.setText(((String[])a.i(this.a).get(paramInt))[3]);
      localo.e.setText(((String[])a.i(this.a).get(paramInt))[4]);
      localo.f.setText(((String[])a.i(this.a).get(paramInt))[5]);
      localo.g.setText(((String[])a.i(this.a).get(paramInt))[6]);
      localo.h.setText(((String[])a.i(this.a).get(paramInt))[7]);
      localo.a.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.b.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.c.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.d.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.e.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.f.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.g.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      localo.h.setTextColor(((Integer)a.j(this.a).get(paramInt)).intValue());
      if ((a.k(this.a) == -1) || (paramInt != a.k(this.a))) {
        break;
      }
      localo.j.setVisibility(0);
      return paramView;
      localo = (o)paramView.getTag();
      paramViewGroup = (p)paramView.getTag(localo.j.getId());
    }
    localo.j.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */