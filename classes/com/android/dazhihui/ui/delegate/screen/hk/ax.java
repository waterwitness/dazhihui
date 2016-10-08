package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Vector;

class ax
  extends BaseAdapter
{
  private int b;
  private LayoutInflater c;
  private View d;
  
  public ax(HKEntrust paramHKEntrust, Context paramContext)
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
    return HKEntrust.x(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return HKEntrust.x(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new ay(this);
      paramView = this.c.inflate(2130903493, null);
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131558889));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560809));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131560810));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131560812));
      paramViewGroup.e = ((TextView)paramView.findViewById(2131560813));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131560815));
      paramViewGroup.g = ((TextView)paramView.findViewById(2131560816));
      paramViewGroup.h = ((TextView)paramView.findViewById(2131560819));
      paramViewGroup.i = ((TextView)paramView.findViewById(2131560820));
      paramViewGroup.j = ((TextView)paramView.findViewById(2131560782));
      paramView.setTag(paramViewGroup);
      if (((Integer)HKEntrust.F(this.a).get(paramInt)).intValue() != -65536) {
        break label653;
      }
      paramViewGroup.a.setBackgroundResource(2130839028);
    }
    for (;;)
    {
      paramViewGroup.b.setText(((String[])HKEntrust.x(this.a).get(paramInt))[0]);
      paramViewGroup.c.setText(((String[])HKEntrust.x(this.a).get(paramInt))[1]);
      paramViewGroup.d.setText(((String[])HKEntrust.x(this.a).get(paramInt))[2]);
      paramViewGroup.e.setText(((String[])HKEntrust.x(this.a).get(paramInt))[3]);
      paramViewGroup.f.setText(((String[])HKEntrust.x(this.a).get(paramInt))[4]);
      paramViewGroup.g.setText(((String[])HKEntrust.x(this.a).get(paramInt))[5]);
      paramViewGroup.h.setText(((String[])HKEntrust.x(this.a).get(paramInt))[6]);
      paramViewGroup.i.setText(((String[])HKEntrust.x(this.a).get(paramInt))[7]);
      paramViewGroup.j.setText(bk.e(((String[])HKEntrust.x(this.a).get(paramInt))[9]));
      paramViewGroup.j.setBackgroundColor(bk.f(((String[])HKEntrust.x(this.a).get(paramInt))[9]));
      paramViewGroup.b.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.c.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.d.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.e.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.f.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.g.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.h.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.i.setTextColor(((Integer)HKEntrust.F(this.a).get(paramInt)).intValue());
      paramViewGroup.i.setVisibility(8);
      paramViewGroup.a.setVisibility(8);
      return paramView;
      paramViewGroup = (ay)paramView.getTag();
      break;
      label653:
      paramViewGroup.a.setBackgroundResource(2130839074);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */