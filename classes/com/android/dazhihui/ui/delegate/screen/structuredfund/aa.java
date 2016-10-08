package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Vector;

class aa
  extends BaseAdapter
{
  private View b;
  private int c = 0;
  
  public aa(i parami)
  {
    this.b = i.H(parami).inflate(2130903503, null);
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int getCount()
  {
    return i.E(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return i.E(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = i.H(this.a).inflate(2130903476, null);
      paramViewGroup = new ad(this.a, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
      paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131558996));
      paramViewGroup.g = ((TextView)paramView.findViewById(2131558995));
      paramViewGroup.h = ((TextView)paramView.findViewById(2131558997));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a.setText(((String[])i.E(this.a).get(paramInt))[0]);
      paramViewGroup.b.setText(((String[])i.E(this.a).get(paramInt))[1]);
      paramViewGroup.c.setText(((String[])i.E(this.a).get(paramInt))[2]);
      paramViewGroup.d.setText(((String[])i.E(this.a).get(paramInt))[3]);
      paramViewGroup.e.setText(((String[])i.E(this.a).get(paramInt))[4]);
      paramViewGroup.f.setText(((String[])i.E(this.a).get(paramInt))[5]);
      paramViewGroup.g.setText(((String[])i.E(this.a).get(paramInt))[6]);
      paramViewGroup.h.setText(((String[])i.E(this.a).get(paramInt))[7]);
      paramViewGroup.a.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.b.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.c.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.d.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.e.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.f.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.g.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      paramViewGroup.h.setTextColor(((Integer)i.D(this.a).get(paramInt)).intValue());
      return paramView;
      paramViewGroup = (ad)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */