package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;

class fq
  extends BaseAdapter
{
  fq(IndexTopLayout paramIndexTopLayout) {}
  
  public void a(y paramy)
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return IndexTopLayout.c().length;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new fr(this);
      paramView = IndexTopLayout.h(this.a).inflate(2130903412, null);
      fr.a(paramViewGroup, (TextView)paramView.findViewById(2131559807));
      fr.b(paramViewGroup, (TextView)paramView.findViewById(2131559808));
      fr.c(paramViewGroup, (TextView)paramView.findViewById(2131559811));
      paramView.setTag(paramViewGroup);
      if (g.a().b() != y.b) {
        break label253;
      }
      fr.a(paramViewGroup).setTextColor(this.a.getResources().getColor(2131493609));
    }
    for (;;)
    {
      if ((IndexTopLayout.g(this.a) == null) || (IndexTopLayout.g(this.a).size() != IndexTopLayout.c().length)) {
        break label275;
      }
      fr.a(paramViewGroup).setText(IndexTopLayout.c()[paramInt]);
      fr.b(paramViewGroup).setText(((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getZx());
      fr.c(paramViewGroup).setText(((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getZf());
      fr.b(paramViewGroup).setTextColor(((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getColor());
      fr.c(paramViewGroup).setTextColor(((SelfStock)IndexTopLayout.g(this.a).get(paramInt)).getColor());
      return paramView;
      paramViewGroup = (fr)paramView.getTag();
      break;
      label253:
      fr.a(paramViewGroup).setTextColor(this.a.getResources().getColor(2131493546));
    }
    label275:
    fr.a(paramViewGroup).setText(IndexTopLayout.c()[paramInt]);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */