package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Vector;

class cl
  extends BaseAdapter
{
  private View b;
  private int c = 0;
  private int d;
  
  public cl(TradeQuery paramTradeQuery, int paramInt)
  {
    this.b = TradeQuery.r(paramTradeQuery).inflate(2130903503, null);
    this.d = paramInt;
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
    return TradeQuery.s(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return TradeQuery.s(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((TradeQuery.t(this.a) == 11134) || (TradeQuery.t(this.a) == 11136)) {
      if (paramView == null)
      {
        paramView = TradeQuery.r(this.a).inflate(2130903525, null);
        paramViewGroup = new co(this.a, null);
        paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
        paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
        paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
        paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
        paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
        paramViewGroup.f = ((TextView)paramView.findViewById(2131558996));
        paramViewGroup.g = ((TextView)paramView.findViewById(2131558995));
        paramViewGroup.h = ((ImageView)paramView.findViewById(2131558889));
        paramView.setTag(paramViewGroup);
        paramViewGroup.a.setText(((String[])TradeQuery.s(this.a).get(paramInt))[0]);
        paramViewGroup.b.setText(((String[])TradeQuery.s(this.a).get(paramInt))[1]);
        paramViewGroup.c.setText(((String[])TradeQuery.s(this.a).get(paramInt))[2]);
        paramViewGroup.d.setText(((String[])TradeQuery.s(this.a).get(paramInt))[3]);
        paramViewGroup.e.setText(((String[])TradeQuery.s(this.a).get(paramInt))[4]);
        paramViewGroup.f.setText(((String[])TradeQuery.s(this.a).get(paramInt))[5]);
        paramViewGroup.g.setText(((String[])TradeQuery.s(this.a).get(paramInt))[6]);
        paramViewGroup.a.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.b.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.c.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.d.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.e.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.f.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        paramViewGroup.g.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
        if (((Integer)TradeQuery.u(this.a).get(paramInt)).intValue() != -65536) {
          break label542;
        }
        paramViewGroup.h.setBackgroundResource(2130839028);
        paramViewGroup = paramView;
      }
    }
    label542:
    do
    {
      return paramViewGroup;
      paramViewGroup = (co)paramView.getTag();
      break;
      paramViewGroup.h.setBackgroundResource(2130839074);
      return paramView;
      if ((TradeQuery.t(this.a) == 11140) || (TradeQuery.t(this.a) == 11142))
      {
        if (paramView == null)
        {
          paramView = TradeQuery.r(this.a).inflate(2130903522, null);
          paramViewGroup = new cn(this.a, null);
          paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
          paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
          paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
          paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
          paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
          paramViewGroup.f = ((ImageView)paramView.findViewById(2131558889));
          paramView.setTag(paramViewGroup);
        }
        for (;;)
        {
          paramViewGroup.a.setText(((String[])TradeQuery.s(this.a).get(paramInt))[0]);
          paramViewGroup.b.setText(((String[])TradeQuery.s(this.a).get(paramInt))[1]);
          paramViewGroup.c.setText(((String[])TradeQuery.s(this.a).get(paramInt))[2]);
          paramViewGroup.d.setText(((String[])TradeQuery.s(this.a).get(paramInt))[3]);
          paramViewGroup.e.setText(((String[])TradeQuery.s(this.a).get(paramInt))[4]);
          paramViewGroup.a.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
          paramViewGroup.b.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
          paramViewGroup.c.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
          paramViewGroup.d.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
          paramViewGroup.e.setTextColor(((Integer)TradeQuery.u(this.a).get(paramInt)).intValue());
          if (((Integer)TradeQuery.u(this.a).get(paramInt)).intValue() != -65536) {
            break;
          }
          paramViewGroup.f.setBackgroundResource(2130839028);
          return paramView;
          paramViewGroup = (cn)paramView.getTag();
        }
        paramViewGroup.f.setBackgroundResource(2130839074);
        return paramView;
      }
      if (TradeQuery.t(this.a) == 11148)
      {
        if (paramView == null)
        {
          paramView = TradeQuery.r(this.a).inflate(2130903526, null);
          paramViewGroup = new cp(this.a, null);
          paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
          paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
          paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
          paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
          paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
          paramView.setTag(paramViewGroup);
        }
        for (;;)
        {
          paramViewGroup.a.setText(((String[])TradeQuery.s(this.a).get(paramInt))[0]);
          paramViewGroup.b.setText(((String[])TradeQuery.s(this.a).get(paramInt))[1]);
          paramViewGroup.c.setText(((String[])TradeQuery.s(this.a).get(paramInt))[2]);
          paramViewGroup.d.setText(((String[])TradeQuery.s(this.a).get(paramInt))[3]);
          paramViewGroup.e.setText(((String[])TradeQuery.s(this.a).get(paramInt))[4]);
          return paramView;
          paramViewGroup = (cp)paramView.getTag();
        }
      }
      paramViewGroup = paramView;
    } while (TradeQuery.t(this.a) != 12024);
    if (paramView == null)
    {
      paramView = TradeQuery.r(this.a).inflate(2130903527, null);
      paramViewGroup = new cq(this.a, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a.setText(((String[])TradeQuery.s(this.a).get(paramInt))[0]);
      paramViewGroup.b.setText(((String[])TradeQuery.s(this.a).get(paramInt))[1]);
      paramViewGroup.c.setText(((String[])TradeQuery.s(this.a).get(paramInt))[2]);
      paramViewGroup.d.setText(((String[])TradeQuery.s(this.a).get(paramInt))[3]);
      return paramView;
      paramViewGroup = (cq)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */