package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d;
import com.android.dazhihui.ui.screen.y;

class ez
  extends BaseAdapter
{
  private ez(IndexStockChartBottomWidget paramIndexStockChartBottomWidget) {}
  
  public void a()
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return IndexStockChartBottomWidget.t(this.a).length;
  }
  
  public Object getItem(int paramInt)
  {
    return IndexStockChartBottomWidget.t(this.a)[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      paramView = new fh(this);
      localView = LayoutInflater.from(IndexStockChartBottomWidget.r(this.a)).inflate(2130903440, null);
      paramView.b = ((TextView)localView.findViewById(2131560545));
      paramView.c = ((TextView)localView.findViewById(2131560547));
      paramView.d = ((ImageView)localView.findViewById(2131560546));
      paramView.e = ((ImageView)localView.findViewById(2131560548));
      paramView.f = ((ImageView)localView.findViewById(2131560549));
      paramView.a = localView.findViewById(2131560543);
      localView.setTag(paramView);
      paramViewGroup = paramView;
      if (IndexStockChartBottomWidget.s(this.a) != y.a) {
        break label292;
      }
      paramViewGroup.a.setBackgroundResource(2131493467);
      localView.setBackgroundResource(2131493465);
      paramViewGroup.b.setTextColor(this.a.getResources().getColor(2131493473));
      paramViewGroup.c.setTextColor(this.a.getResources().getColor(2131493471));
      label187:
      paramViewGroup.b.setText(IndexStockChartBottomWidget.t(this.a)[paramInt]);
      if (!IndexStockChartBottomWidget.t(this.a)[paramInt].equals(IndexStockChartBottomWidget.u(this.a)[0])) {
        break label362;
      }
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.d.setVisibility(8);
      paramViewGroup.e.setVisibility(8);
      paramViewGroup.f.setVisibility(0);
      localView.setOnClickListener(new fa(this));
    }
    label292:
    label362:
    do
    {
      return localView;
      paramViewGroup = (fh)paramView.getTag();
      localView = paramView;
      break;
      if (IndexStockChartBottomWidget.s(this.a) != y.b) {
        break label187;
      }
      paramViewGroup.a.setBackgroundResource(2131493468);
      localView.setBackgroundResource(2131493466);
      paramViewGroup.b.setTextColor(this.a.getResources().getColor(2131493474));
      paramViewGroup.c.setTextColor(this.a.getResources().getColor(2131493472));
      break label187;
      if (IndexStockChartBottomWidget.t(this.a)[paramInt].equals(IndexStockChartBottomWidget.u(this.a)[1]))
      {
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.c.setText("使用说明");
        paramViewGroup.d.setVisibility(8);
        paramViewGroup.e.setVisibility(0);
        if (d.a().d()) {
          paramViewGroup.e.setImageResource(2130837524);
        }
        for (;;)
        {
          paramViewGroup.f.setVisibility(8);
          paramViewGroup.e.setOnClickListener(new fb(this, paramViewGroup));
          paramViewGroup.c.setOnClickListener(new fc(this));
          return localView;
          paramViewGroup.e.setImageResource(2130837523);
        }
      }
      if (IndexStockChartBottomWidget.t(this.a)[paramInt].equals(IndexStockChartBottomWidget.u(this.a)[2]))
      {
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.c.setText("战法说明");
        paramViewGroup.d.setVisibility(8);
        paramViewGroup.e.setVisibility(0);
        if (d.a().e()) {
          paramViewGroup.e.setImageResource(2130837524);
        }
        for (;;)
        {
          paramViewGroup.f.setVisibility(8);
          paramViewGroup.e.setOnClickListener(new fd(this, paramViewGroup));
          paramViewGroup.c.setOnClickListener(new fe(this));
          return localView;
          paramViewGroup.e.setImageResource(2130837523);
        }
      }
    } while (!IndexStockChartBottomWidget.t(this.a)[paramInt].equals(IndexStockChartBottomWidget.u(this.a)[3]));
    paramViewGroup.c.setVisibility(0);
    paramViewGroup.c.setText("看看有多神奇");
    paramViewGroup.d.setVisibility(8);
    paramViewGroup.e.setVisibility(0);
    if (d.a().f()) {
      paramViewGroup.e.setImageResource(2130837524);
    }
    for (;;)
    {
      paramViewGroup.f.setVisibility(8);
      paramViewGroup.e.setOnClickListener(new ff(this, paramViewGroup));
      paramViewGroup.c.setOnClickListener(new fg(this));
      return localView;
      paramViewGroup.e.setImageResource(2130837523);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */