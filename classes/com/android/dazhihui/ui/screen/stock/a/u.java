package com.android.dazhihui.ui.screen.stock.a;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.HashMap;

class u
  extends BaseAdapter
{
  u(l paraml) {}
  
  public void a(y paramy)
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    ArrayList localArrayList = (ArrayList)this.a.C.get(Integer.valueOf(this.a.j.length));
    if ((localArrayList != null) && (localArrayList.size() > 0)) {
      return localArrayList.size();
    }
    return this.a.y.length;
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
      paramViewGroup = new v(this);
      paramView = LayoutInflater.from(this.a.getActivity()).inflate(2130903267, null);
      v.a(paramViewGroup, (TextView)paramView.findViewById(2131559807));
      v.b(paramViewGroup, (TextView)paramView.findViewById(2131559808));
      v.c(paramViewGroup, (TextView)paramView.findViewById(2131559810));
      v.d(paramViewGroup, (TextView)paramView.findViewById(2131559811));
      v.a(paramViewGroup, paramView.findViewById(2131559809));
      v.a(paramViewGroup).setVisibility(0);
      paramView.setTag(paramViewGroup);
      if (l.a(this.a) != y.b) {
        break label330;
      }
      v.b(paramViewGroup).setTextColor(this.a.getActivity().getResources().getColor(2131493609));
    }
    for (;;)
    {
      ArrayList localArrayList = (ArrayList)this.a.C.get(Integer.valueOf(this.a.j.length));
      if ((localArrayList == null) || (localArrayList.size() <= 0)) {
        break label355;
      }
      v.b(paramViewGroup).setText(((MarketStockVo)localArrayList.get(paramInt)).getStockName());
      v.c(paramViewGroup).setText(((MarketStockVo)localArrayList.get(paramInt)).getZx());
      v.d(paramViewGroup).setText(((MarketStockVo)localArrayList.get(paramInt)).getZd());
      v.e(paramViewGroup).setText(((MarketStockVo)localArrayList.get(paramInt)).getZf());
      v.c(paramViewGroup).setTextColor(((MarketStockVo)localArrayList.get(paramInt)).getColor());
      v.d(paramViewGroup).setTextColor(((MarketStockVo)localArrayList.get(paramInt)).getColor());
      v.e(paramViewGroup).setTextColor(((MarketStockVo)localArrayList.get(paramInt)).getColor());
      return paramView;
      paramViewGroup = (v)paramView.getTag();
      break;
      label330:
      v.b(paramViewGroup).setTextColor(this.a.getActivity().getResources().getColor(2131493546));
    }
    label355:
    v.b(paramViewGroup).setText(this.a.y[paramInt]);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */