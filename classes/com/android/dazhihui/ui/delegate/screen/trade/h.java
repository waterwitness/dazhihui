package com.android.dazhihui.ui.delegate.screen.trade;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Vector;

class h
  extends BaseAdapter
{
  h(VoteScreen paramVoteScreen) {}
  
  public int getCount()
  {
    return VoteScreen.i(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return VoteScreen.i(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    k localk;
    if (paramView == null)
    {
      paramView = VoteScreen.s(this.a).inflate(2130903583, null);
      localk = new k(this.a, null);
      localk.a = ((TextView)paramView.findViewById(2131561337));
      localk.b = ((TextView)paramView.findViewById(2131559141));
      localk.c = ((Button)paramView.findViewById(2131561338));
      localk.d = ((LinearLayout)paramView.findViewById(2131561339));
      localk.e = ((Button)paramView.findViewById(2131561334));
      localk.f = ((Button)paramView.findViewById(2131561335));
      localk.g = ((Button)paramView.findViewById(2131561336));
      paramViewGroup = new m(this.a);
      localk.c.setOnClickListener(paramViewGroup);
      localk.e.setOnClickListener(paramViewGroup);
      localk.f.setOnClickListener(paramViewGroup);
      localk.g.setOnClickListener(paramViewGroup);
      paramView.setTag(localk);
      paramView.setTag(localk.c.getId(), paramViewGroup);
    }
    while ((VoteScreen.i(this.a) == null) || (VoteScreen.i(this.a).size() <= paramInt))
    {
      return paramView;
      localk = (k)paramView.getTag();
      paramViewGroup = (m)paramView.getTag(localk.c.getId());
    }
    localk.a.setText(((j)VoteScreen.i(this.a).get(paramInt)).d);
    localk.b.setText(((j)VoteScreen.i(this.a).get(paramInt)).a);
    paramViewGroup.a(paramInt);
    if (((j)VoteScreen.i(this.a).get(paramInt)).f.equals("1"))
    {
      localk.c.setText("已表决");
      localk.c.setEnabled(false);
      localk.c.getResources().getDrawable(2130837598);
      localk.c.setTextColor(-16777216);
      if ((VoteScreen.t(this.a) != -1) && (VoteScreen.t(this.a) == paramInt))
      {
        localk.d.setVisibility(0);
        return paramView;
      }
    }
    else
    {
      if (VoteScreen.b(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).d)) {
        if (VoteScreen.c(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).d)) {
          localk.c.setText(VoteScreen.d(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).m));
        }
      }
      for (;;)
      {
        localk.c.setEnabled(true);
        localk.c.setBackgroundDrawable(this.a.getResources().getDrawable(2130837598));
        localk.c.setTextColor(this.a.getResources().getColor(2131493036));
        break;
        if (VoteScreen.e(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).d))
        {
          localk.c.setText("已表决");
        }
        else
        {
          localk.c.setText("未表决");
          continue;
          localk.c.setText(VoteScreen.d(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).m));
        }
      }
    }
    localk.d.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */