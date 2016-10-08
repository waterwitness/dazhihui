package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import java.util.List;

class fj
  extends BaseAdapter
{
  private fj(IndexStockChartBottomWidget paramIndexStockChartBottomWidget) {}
  
  public void a(y paramy)
  {
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return 1;
  }
  
  public Object getItem(int paramInt)
  {
    if (IndexStockChartBottomWidget.m(this.a).size() == 0) {
      return null;
    }
    paramInt = IndexStockChartBottomWidget.q(this.a);
    return IndexStockChartBottomWidget.m(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramInt = IndexStockChartBottomWidget.q(this.a);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(IndexStockChartBottomWidget.r(this.a)).inflate(2130903441, null);
    }
    if (IndexStockChartBottomWidget.m(this.a).size() == 0) {
      return paramViewGroup;
    }
    if (paramInt == IndexStockChartBottomWidget.m(this.a).size()) {
      paramInt = 0;
    }
    for (;;)
    {
      paramView = (TextView)paramViewGroup.findViewById(2131558624);
      TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131558625);
      TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131558627);
      fk localfk = (fk)IndexStockChartBottomWidget.m(this.a).get(paramInt);
      if (paramInt == 0)
      {
        paramView.setText("上证");
        if (IndexStockChartBottomWidget.s(this.a) != y.b) {
          break label233;
        }
        paramView.setTextColor(this.a.getResources().getColor(2131493626));
      }
      for (;;)
      {
        paramInt = IndexStockChartBottomWidget.a(this.a, localfk, fi.a);
        localTextView1.setTextColor(paramInt);
        localTextView1.setText(IndexStockChartBottomWidget.a(this.a, localfk));
        localTextView2.setTextColor(paramInt);
        localTextView2.setText(IndexStockChartBottomWidget.b(this.a, localfk));
        return paramViewGroup;
        if (paramInt == 1)
        {
          paramView.setText("深证");
          break;
        }
        paramView.setText("创业");
        break;
        label233:
        paramView.setTextColor(this.a.getResources().getColor(2131493563));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */