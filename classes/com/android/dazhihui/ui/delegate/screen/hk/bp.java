package com.android.dazhihui.ui.delegate.screen.hk;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Vector;

class bp
  extends BaseAdapter
{
  private View b;
  private int c = 0;
  private int d;
  
  public bp(HKQuery paramHKQuery, int paramInt)
  {
    this.b = HKQuery.x(paramHKQuery).inflate(2130903503, null);
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
    return HKQuery.g(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return HKQuery.g(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((HKQuery.a(this.a) == 15016) || (HKQuery.a(this.a) == 15018)) {
      if (paramView == null)
      {
        paramView = HKQuery.x(this.a).inflate(2130903498, null);
        paramViewGroup = new br(this.a, null);
        paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
        paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
        paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
        paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
        paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
        paramViewGroup.f = ((TextView)paramView.findViewById(2131558996));
        paramViewGroup.g = ((TextView)paramView.findViewById(2131558995));
        paramViewGroup.h = ((ImageView)paramView.findViewById(2131558889));
        paramViewGroup.i = ((TextView)paramView.findViewById(2131560782));
        paramViewGroup.i.setVisibility(0);
        paramView.setTag(paramViewGroup);
        paramViewGroup.a.setText(((String[])HKQuery.g(this.a).get(paramInt))[0]);
        paramViewGroup.b.setText(((String[])HKQuery.g(this.a).get(paramInt))[1]);
        paramViewGroup.c.setText(((String[])HKQuery.g(this.a).get(paramInt))[2]);
        paramViewGroup.d.setText(((String[])HKQuery.g(this.a).get(paramInt))[3]);
        paramViewGroup.e.setText(((String[])HKQuery.g(this.a).get(paramInt))[4]);
        paramViewGroup.f.setText(((String[])HKQuery.g(this.a).get(paramInt))[5]);
        paramViewGroup.g.setText(((String[])HKQuery.g(this.a).get(paramInt))[6]);
        paramViewGroup.a.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.b.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.c.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.d.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.e.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.f.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.g.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
        paramViewGroup.i.setText(bk.e(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
        paramViewGroup.i.setBackgroundColor(bk.f(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
        if (((Integer)HKQuery.y(this.a).get(paramInt)).intValue() != -65536) {
          break label633;
        }
        paramViewGroup.h.setBackgroundResource(2130839028);
        paramViewGroup = paramView;
      }
    }
    label633:
    TextView localTextView;
    String str;
    label1510:
    label1737:
    label1758:
    label1770:
    do
    {
      return paramViewGroup;
      paramViewGroup = (br)paramView.getTag();
      break;
      paramViewGroup.h.setBackgroundResource(2130839074);
      return paramView;
      if ((HKQuery.a(this.a) == 15020) || (HKQuery.a(this.a) == 15022))
      {
        if (paramView == null)
        {
          paramView = HKQuery.x(this.a).inflate(2130903496, null);
          paramViewGroup = new br(this.a, null);
          paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
          paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
          paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
          paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
          paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
          paramViewGroup.h = ((ImageView)paramView.findViewById(2131558889));
          paramViewGroup.i = ((TextView)paramView.findViewById(2131560782));
          paramViewGroup.i.setVisibility(0);
          paramView.setTag(paramViewGroup);
        }
        for (;;)
        {
          paramViewGroup.a.setText(((String[])HKQuery.g(this.a).get(paramInt))[0]);
          paramViewGroup.b.setText(((String[])HKQuery.g(this.a).get(paramInt))[1]);
          paramViewGroup.c.setText(((String[])HKQuery.g(this.a).get(paramInt))[2]);
          paramViewGroup.d.setText(((String[])HKQuery.g(this.a).get(paramInt))[3]);
          paramViewGroup.e.setText(((String[])HKQuery.g(this.a).get(paramInt))[4]);
          paramViewGroup.a.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.b.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.c.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.d.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.e.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.i.setText(bk.e(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
          paramViewGroup.i.setBackgroundColor(bk.f(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
          if (((Integer)HKQuery.y(this.a).get(paramInt)).intValue() != -65536) {
            break;
          }
          paramViewGroup.h.setBackgroundResource(2130839028);
          return paramView;
          paramViewGroup = (br)paramView.getTag();
        }
        paramViewGroup.h.setBackgroundResource(2130839074);
        return paramView;
      }
      if (HKQuery.a(this.a) == 15058)
      {
        if (paramView == null)
        {
          paramView = HKQuery.x(this.a).inflate(2130903496, null);
          paramViewGroup = new br(this.a, null);
          paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
          paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
          paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
          paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
          paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
          paramViewGroup.j = ((LinearLayout)paramView.findViewById(2131560834));
          paramViewGroup.h = ((ImageView)paramView.findViewById(2131558889));
          paramViewGroup.i = ((TextView)paramView.findViewById(2131560782));
          paramViewGroup.i.setVisibility(0);
          paramView.setTag(paramViewGroup);
          paramViewGroup.a.setText(((String[])HKQuery.g(this.a).get(paramInt))[0]);
          paramViewGroup.b.setText(((String[])HKQuery.g(this.a).get(paramInt))[1]);
          paramViewGroup.c.setText(((String[])HKQuery.g(this.a).get(paramInt))[2]);
          if (TextUtils.isEmpty(((String[])HKQuery.g(this.a).get(paramInt))[3])) {
            break label1758;
          }
          localTextView = paramViewGroup.d;
          if (!((String[])HKQuery.g(this.a).get(paramInt))[3].contains("-")) {
            break label1737;
          }
          str = ((String[])HKQuery.g(this.a).get(paramInt))[3].substring(((String[])HKQuery.g(this.a).get(paramInt))[3].indexOf("-") + 1, ((String[])HKQuery.g(this.a).get(paramInt))[3].length());
          localTextView.setText(str);
        }
        for (;;)
        {
          paramViewGroup.e.setText(((String[])HKQuery.g(this.a).get(paramInt))[4]);
          paramViewGroup.a.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.b.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.c.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.d.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.e.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
          paramViewGroup.i.setVisibility(8);
          if ((TextUtils.isEmpty(((String[])HKQuery.g(this.a).get(paramInt))[3])) || (Double.parseDouble(((String[])HKQuery.g(this.a).get(paramInt))[3]) <= 0.0D)) {
            break label1770;
          }
          paramViewGroup.h.setBackgroundResource(2130839041);
          return paramView;
          paramViewGroup = (br)paramView.getTag();
          break;
          str = ((String[])HKQuery.g(this.a).get(paramInt))[3];
          break label1510;
          paramViewGroup.d.setText("");
        }
        paramViewGroup.h.setBackgroundResource(2130839045);
        return paramView;
      }
      paramViewGroup = paramView;
    } while (HKQuery.a(this.a) != 15060);
    if (paramView == null)
    {
      paramView = HKQuery.x(this.a).inflate(2130903498, null);
      paramViewGroup = new br(this.a, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558890));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558891));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558892));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131558893));
      paramViewGroup.e = ((TextView)paramView.findViewById(2131558994));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131558996));
      paramViewGroup.g = ((TextView)paramView.findViewById(2131558995));
      paramViewGroup.h = ((ImageView)paramView.findViewById(2131558889));
      paramViewGroup.i = ((TextView)paramView.findViewById(2131560782));
      paramViewGroup.i.setVisibility(0);
      paramView.setTag(paramViewGroup);
      paramViewGroup.a.setText(((String[])HKQuery.g(this.a).get(paramInt))[3]);
      paramViewGroup.b.setText(((String[])HKQuery.g(this.a).get(paramInt))[4]);
      paramViewGroup.c.setText(((String[])HKQuery.g(this.a).get(paramInt))[1]);
      paramViewGroup.d.setText(((String[])HKQuery.g(this.a).get(paramInt))[2]);
      if (TextUtils.isEmpty(((String[])HKQuery.g(this.a).get(paramInt))[5])) {
        break label2507;
      }
      localTextView = paramViewGroup.e;
      if (!((String[])HKQuery.g(this.a).get(paramInt))[5].contains("-")) {
        break label2486;
      }
      str = ((String[])HKQuery.g(this.a).get(paramInt))[5].substring(((String[])HKQuery.g(this.a).get(paramInt))[5].indexOf("-") + 1, ((String[])HKQuery.g(this.a).get(paramInt))[5].length());
      label2164:
      localTextView.setText(str);
    }
    for (;;)
    {
      paramViewGroup.f.setVisibility(8);
      paramViewGroup.g.setText(((String[])HKQuery.g(this.a).get(paramInt))[6]);
      paramViewGroup.a.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.b.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.c.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.d.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.e.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.g.setTextColor(((Integer)HKQuery.y(this.a).get(paramInt)).intValue());
      paramViewGroup.i.setText(bk.e(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
      paramViewGroup.i.setBackgroundColor(bk.f(((String[])HKQuery.g(this.a).get(paramInt))[(HKQuery.e(this.a).length - 1)]));
      if ((TextUtils.isEmpty(((String[])HKQuery.g(this.a).get(paramInt))[5])) || (Double.parseDouble(((String[])HKQuery.g(this.a).get(paramInt))[5]) <= 0.0D)) {
        break label2519;
      }
      paramViewGroup.h.setBackgroundResource(2130839041);
      return paramView;
      paramViewGroup = (br)paramView.getTag();
      break;
      label2486:
      str = ((String[])HKQuery.g(this.a).get(paramInt))[5];
      break label2164;
      label2507:
      paramViewGroup.e.setText("");
    }
    label2519:
    paramViewGroup.h.setBackgroundResource(2130839045);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */