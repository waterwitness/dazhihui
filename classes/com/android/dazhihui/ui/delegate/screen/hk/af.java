package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Vector;

class af
  extends BaseAdapter
{
  private int b;
  private LayoutInflater c;
  private View d;
  
  public af(HKCaptialHolding paramHKCaptialHolding, Context paramContext)
  {
    this.c = LayoutInflater.from(paramContext);
    this.d = this.c.inflate(2130903503, null);
  }
  
  public View a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int getCount()
  {
    return HKCaptialHolding.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return HKCaptialHolding.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ag localag;
    if (paramView == null)
    {
      localag = new ag(this);
      paramView = this.c.inflate(2130903493, null);
      localag.j = ((LinearLayout)paramView.findViewById(2131560807));
      localag.a = ((ImageView)paramView.findViewById(2131558889));
      localag.b = ((TextView)paramView.findViewById(2131560809));
      localag.c = ((TextView)paramView.findViewById(2131560810));
      localag.d = ((TextView)paramView.findViewById(2131560812));
      localag.e = ((TextView)paramView.findViewById(2131560813));
      localag.f = ((TextView)paramView.findViewById(2131560815));
      localag.g = ((TextView)paramView.findViewById(2131560816));
      localag.h = ((TextView)paramView.findViewById(2131560819));
      localag.i = ((TextView)paramView.findViewById(2131560820));
      localag.k = ((LinearLayout)paramView.findViewById(2131559736));
      localag.l = ((TextView)paramView.findViewById(2131560711));
      localag.m = ((TextView)paramView.findViewById(2131560712));
      localag.n = ((TextView)paramView.findViewById(2131560713));
      localag.o = ((TextView)paramView.findViewById(2131560782));
      paramViewGroup = new ah(this.a);
      localag.j.setOnClickListener(paramViewGroup);
      localag.l.setOnClickListener(paramViewGroup);
      localag.m.setOnClickListener(paramViewGroup);
      localag.n.setOnClickListener(paramViewGroup);
      paramView.setTag(localag);
      paramView.setTag(localag.k.getId(), paramViewGroup);
      paramViewGroup.a(paramInt);
      if (((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue() != -65536) {
        break label870;
      }
      localag.a.setBackgroundResource(2130839028);
    }
    for (;;)
    {
      localag.b.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[0]);
      localag.c.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[1]);
      localag.d.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[2]);
      localag.e.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[3]);
      localag.f.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[4]);
      localag.g.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[5]);
      localag.h.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[6]);
      localag.i.setText(((String[])HKCaptialHolding.a(this.a).get(paramInt))[7]);
      localag.o.setText(bk.e(((String[])HKCaptialHolding.a(this.a).get(paramInt))[9]));
      localag.o.setBackgroundColor(bk.f(((String[])HKCaptialHolding.a(this.a).get(paramInt))[9]));
      localag.b.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.c.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.d.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.e.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.f.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.g.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.h.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.i.setTextColor(((Integer)HKCaptialHolding.b(this.a).get(paramInt)).intValue());
      localag.i.setVisibility(8);
      localag.a.setVisibility(8);
      if ((HKCaptialHolding.c(this.a) == -1) || (paramInt != HKCaptialHolding.c(this.a))) {
        break label883;
      }
      localag.k.setVisibility(0);
      return paramView;
      localag = (ag)paramView.getTag();
      paramViewGroup = (ah)paramView.getTag(localag.k.getId());
      break;
      label870:
      localag.a.setBackgroundResource(2130839074);
    }
    label883:
    localag.k.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */