package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

class ce
  extends BaseAdapter
{
  cg a = null;
  ch b = null;
  
  ce(cd paramcd) {}
  
  public int getCount()
  {
    if (cd.a(this.c) != null) {
      return cd.a(this.c).size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if ((cd.a(this.c) != null) && (cd.a(this.c).size() > paramInt)) {
      return cd.a(this.c).get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (cf)cd.a(this.c).get(paramInt);
    if (paramView == null)
    {
      paramView = this.c.getActivity().getLayoutInflater().inflate(2130903218, null);
      this.a = new cg(this.c);
      this.a.a = ((TextView)paramView.findViewById(2131559517));
      this.a.b = ((TextView)paramView.findViewById(2131559518));
      this.a.c = ((TextView)paramView.findViewById(2131559519));
      this.a.d = ((TextView)paramView.findViewById(2131559520));
      this.b = new ch(this.c);
      this.a.e = ((TextView)paramView.findViewById(2131559522));
      this.a.e.setOnClickListener(this.b);
      this.a.f = ((TextView)paramView.findViewById(2131559523));
      this.a.f.setOnClickListener(this.b);
      paramView.setTag(this.a);
      paramView.setTag(2131559522, this.b);
      this.b.a(paramInt);
      if (!paramViewGroup.e) {
        break label342;
      }
      this.a.c.setText("年化收益");
      this.a.e.setText("自动转入");
      this.a.e.setBackgroundResource(2130837970);
      this.a.f.setVisibility(8);
    }
    for (;;)
    {
      this.a.b.setText(paramViewGroup.f);
      this.a.a.setText(paramViewGroup.b);
      this.a.d.setText(paramViewGroup.d);
      return paramView;
      this.a = ((cg)paramView.getTag());
      this.b = ((ch)paramView.getTag(2131559522));
      break;
      label342:
      this.a.c.setText("基金市值");
      this.a.e.setText("申购");
      this.a.f.setText("赎回");
      this.a.e.setBackgroundDrawable(this.c.getResources().getDrawable(2130839035));
      this.a.e.setTextColor(this.c.getResources().getColorStateList(2130839036));
      this.a.f.setBackgroundDrawable(this.c.getResources().getDrawable(2130839037));
      this.a.f.setTextColor(this.c.getResources().getColorStateList(2130839038));
      this.a.f.setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */