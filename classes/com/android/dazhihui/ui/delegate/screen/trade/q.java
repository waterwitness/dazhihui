package com.android.dazhihui.ui.delegate.screen.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.Vector;

class q
  extends BaseAdapter
{
  q(VoteShareholderMeeting paramVoteShareholderMeeting) {}
  
  public int getCount()
  {
    return VoteShareholderMeeting.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return ((s)VoteShareholderMeeting.a(this.a).get(paramInt)).b;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    r localr;
    if (paramView == null)
    {
      paramView = VoteShareholderMeeting.b(this.a).inflate(2130903587, null);
      localr = new r(this, null);
      localr.a = ((TextView)paramView.findViewById(2131560965));
      localr.b = ((TextView)paramView.findViewById(2131560236));
      localr.c = ((TextView)paramView.findViewById(2131560239));
      localr.d = ((TextView)paramView.findViewById(2131560242));
      localr.e = ((Button)paramView.findViewById(2131561338));
      paramViewGroup = new t(this.a);
      localr.e.setOnClickListener(paramViewGroup);
      paramView.setTag(localr);
      paramView.setTag(localr.e.getId(), paramViewGroup);
    }
    while ((VoteShareholderMeeting.a(this.a) == null) || (VoteShareholderMeeting.a(this.a).size() <= paramInt))
    {
      return paramView;
      localr = (r)paramView.getTag();
      paramViewGroup = (t)paramView.getTag(localr.e.getId());
    }
    localr.a.setText(((s)VoteShareholderMeeting.a(this.a).get(paramInt)).a);
    localr.b.setText(((s)VoteShareholderMeeting.a(this.a).get(paramInt)).b);
    localr.c.setText(((s)VoteShareholderMeeting.a(this.a).get(paramInt)).d);
    localr.d.setText(((s)VoteShareholderMeeting.a(this.a).get(paramInt)).c);
    paramViewGroup.a(paramInt);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */