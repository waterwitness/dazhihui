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

class al
  extends BaseAdapter
{
  private ArrayList<MarketStockVo> b = null;
  private int c;
  
  al(af paramaf) {}
  
  private int a()
  {
    if (this.c == 6) {
      this.b = ((ArrayList)this.a.e.get(this.a.b[0]));
    }
    while ((this.b != null) && (this.b.size() > 0))
    {
      return this.b.size();
      if (this.c == 4) {
        this.b = ((ArrayList)this.a.e.get(this.a.b[1]));
      } else if (this.c == 8) {
        this.b = ((ArrayList)this.a.e.get(this.a.b[2]));
      } else if (this.c == 1) {
        this.b = ((ArrayList)this.a.e.get(this.a.b[3]));
      } else if (this.c == 7) {
        this.b = ((ArrayList)this.a.e.get(this.a.b[4]));
      }
    }
    switch (this.c)
    {
    case 2: 
    case 3: 
    case 5: 
    default: 
      return 0;
    case 6: 
      return 6;
    case 4: 
      return 4;
    case 8: 
      return 6;
    case 1: 
      return 1;
    }
    return 6;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(y paramy)
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return a();
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
      paramViewGroup = new am(this);
      paramView = LayoutInflater.from(this.a.getActivity()).inflate(2130903267, null);
      am.a(paramViewGroup, (TextView)paramView.findViewById(2131559807));
      am.b(paramViewGroup, (TextView)paramView.findViewById(2131559808));
      am.c(paramViewGroup, (TextView)paramView.findViewById(2131559810));
      am.d(paramViewGroup, (TextView)paramView.findViewById(2131559811));
      am.a(paramViewGroup, paramView.findViewById(2131559809));
      am.a(paramViewGroup).setVisibility(0);
      paramView.setTag(paramViewGroup);
      if (af.a(this.a) != y.b) {
        break label340;
      }
      am.b(paramViewGroup).setTextColor(this.a.getActivity().getResources().getColor(2131493609));
      label145:
      if ((this.b == null) || (this.b.size() <= 0)) {
        break label365;
      }
      am.b(paramViewGroup).setText(((MarketStockVo)this.b.get(paramInt)).getStockName());
      am.c(paramViewGroup).setText(((MarketStockVo)this.b.get(paramInt)).getZx());
      am.d(paramViewGroup).setText(((MarketStockVo)this.b.get(paramInt)).getZd());
      am.e(paramViewGroup).setText(((MarketStockVo)this.b.get(paramInt)).getZf());
      am.c(paramViewGroup).setTextColor(((MarketStockVo)this.b.get(paramInt)).getColor());
      am.d(paramViewGroup).setTextColor(((MarketStockVo)this.b.get(paramInt)).getColor());
      am.e(paramViewGroup).setTextColor(((MarketStockVo)this.b.get(paramInt)).getColor());
      if (this.c == 8) {
        am.b(paramViewGroup).setTextSize(10.5F);
      }
    }
    label340:
    label365:
    do
    {
      do
      {
        return paramView;
        paramViewGroup = (am)paramView.getTag();
        break;
        am.b(paramViewGroup).setTextColor(this.a.getActivity().getResources().getColor(2131493546));
        break label145;
        if (this.c == 6)
        {
          am.b(paramViewGroup).setText(af.h()[paramInt]);
          return paramView;
        }
        if (this.c == 4)
        {
          am.b(paramViewGroup).setText(af.i()[paramInt]);
          return paramView;
        }
      } while (this.c == 8);
      if (this.c == 1)
      {
        am.b(paramViewGroup).setText(af.f()[paramInt]);
        return paramView;
      }
    } while (this.c != 7);
    am.b(paramViewGroup).setText(af.j()[paramInt]);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */