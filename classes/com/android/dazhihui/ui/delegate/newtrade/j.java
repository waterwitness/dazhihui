package com.android.dazhihui.ui.delegate.newtrade;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.newtrade.b.b;
import java.util.List;

class j
  extends BaseAdapter
{
  j(h paramh) {}
  
  public int getCount()
  {
    return h.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return h.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = h.d(this.a).inflate(2130903435, null);
      paramViewGroup = new k(this.a);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131560486));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560487));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131560482));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131560483));
      paramViewGroup.e = ((TextView)paramView.findViewById(2131560484));
      paramView.setTag(paramViewGroup);
      paramViewGroup.a.setText(((b)h.a(this.a).get(paramInt)).b);
      paramViewGroup.b.setText(((b)h.a(this.a).get(paramInt)).a);
      String str = ((b)h.a(this.a).get(paramInt)).c;
      paramViewGroup.c.setText(str);
      paramViewGroup.d.setText(((b)h.a(this.a).get(paramInt)).d);
      paramViewGroup.e.setText(((b)h.a(this.a).get(paramInt)).e);
      if (n.w(str) < 0.0F) {
        break label286;
      }
    }
    label286:
    for (paramInt = this.a.getResources().getColor(2131492970);; paramInt = this.a.getResources().getColor(2131492962))
    {
      paramViewGroup.c.setTextColor(paramInt);
      paramViewGroup.d.setTextColor(paramInt);
      return paramView;
      paramViewGroup = (k)paramView.getTag();
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */