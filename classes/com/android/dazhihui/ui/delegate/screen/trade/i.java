package com.android.dazhihui.ui.delegate.screen.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Vector;

class i
  extends BaseAdapter
{
  i(VoteScreen paramVoteScreen) {}
  
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
    l locall;
    if (paramView == null)
    {
      paramView = VoteScreen.s(this.a).inflate(2130903585, null);
      locall = new l(this.a, null);
      locall.a = ((TextView)paramView.findViewById(2131561337));
      locall.b = ((TextView)paramView.findViewById(2131559141));
      locall.c = ((TextView)paramView.findViewById(2131561340));
      locall.d = ((EditText)paramView.findViewById(2131561341));
      paramViewGroup = new g(this.a);
      locall.d.addTextChangedListener(paramViewGroup);
      paramView.setTag(locall);
      paramView.setTag(locall.d.getId(), paramViewGroup);
      if ((VoteScreen.i(this.a) != null) && (VoteScreen.i(this.a).size() > paramInt)) {
        break label182;
      }
    }
    for (;;)
    {
      return paramView;
      locall = (l)paramView.getTag();
      paramViewGroup = (g)paramView.getTag(locall.d.getId());
      break;
      label182:
      locall.a.setText(((j)VoteScreen.i(this.a).get(paramInt)).d);
      locall.b.setText(((j)VoteScreen.i(this.a).get(paramInt)).a);
      paramViewGroup.a(paramInt);
      if (VoteScreen.b(this.a, ((j)VoteScreen.i(this.a).get(paramInt)).d))
      {
        locall.c.setVisibility(0);
        locall.d.setVisibility(8);
        locall.c.setText(((j)VoteScreen.i(this.a).get(paramInt)).e + "\n" + ((j)VoteScreen.i(this.a).get(paramInt)).k);
        return paramView;
      }
      locall.c.setVisibility(8);
      locall.d.setVisibility(0);
      if (((j)VoteScreen.i(this.a).get(paramInt)).f.equals("1"))
      {
        locall.d.setText("已表决");
        locall.d.setEnabled(false);
      }
      while (this.a.a)
      {
        locall.d.setEnabled(false);
        return paramView;
        locall.d.setEnabled(true);
        locall.d.setText(((j)VoteScreen.i(this.a).get(paramInt)).n);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */