package com.android.dazhihui.ui.widget.stockchart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.MinuteMenuVo;
import com.android.dazhihui.ui.model.stock.StockMinuteMenuVo.MenuItem;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.a.r;
import java.util.List;

class at
  extends BaseAdapter
{
  at(StockChartContainer paramStockChartContainer) {}
  
  public int getCount()
  {
    if (StockChartContainer.b(this.a) == null) {
      return 0;
    }
    return StockChartContainer.b(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return StockChartContainer.b(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new au(this);
      paramView = LayoutInflater.from(StockChartContainer.d(this.a)).inflate(2130903311, null);
      paramViewGroup.c = ((ImageView)paramView.findViewById(2131560012));
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131560010));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560011));
      paramView.setTag(paramViewGroup);
      if (!((MinuteMenuVo)StockChartContainer.b(this.a).get(paramInt)).isIfDeafaule()) {
        break label199;
      }
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.a.setVisibility(8);
      if ((StockChartContainer.e(this.a) == null) || (StockChartContainer.e(this.a).getType() != 0)) {
        break label184;
      }
      paramViewGroup.b.setText(StockChartContainer.e[paramInt]);
    }
    for (;;)
    {
      if (StockChartContainer.f(this.a) == y.b)
      {
        paramViewGroup.b.setTextColor(-14540254);
        return paramView;
        paramViewGroup = (au)paramView.getTag();
        break;
        label184:
        paramViewGroup.b.setText(StockChartContainer.d[paramInt]);
        continue;
        label199:
        Object localObject = ((MinuteMenuVo)StockChartContainer.b(this.a).get(paramInt)).getItem();
        if (localObject != null)
        {
          String str = ((StockMinuteMenuVo.MenuItem)localObject).getMenuflag();
          localObject = ((StockMinuteMenuVo.MenuItem)localObject).getImgurl();
          if (str.equals("1")) {
            paramViewGroup.c.setVisibility(8);
          }
          for (;;)
          {
            paramViewGroup.a.setVisibility(0);
            r.a(StockChartContainer.d(this.a)).a((String)localObject, paramViewGroup.a);
            paramViewGroup.b.setText(((MinuteMenuVo)StockChartContainer.b(this.a).get(paramInt)).getItem().getMenuname());
            break;
            if (str.equals("2"))
            {
              paramViewGroup.c.setVisibility(0);
              paramViewGroup.c.setImageResource(2130838078);
            }
            else if (str.equals("3"))
            {
              paramViewGroup.c.setVisibility(0);
              paramViewGroup.c.setImageResource(2130838459);
            }
          }
        }
      }
    }
    paramViewGroup.b.setTextColor(-5395027);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */